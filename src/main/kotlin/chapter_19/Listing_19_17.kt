package listing_19_17

open class Money
open class Coin : Money()
class Dime : Coin()
class OneDollarBill : Money()

open class Product
open class Snack : Product()
class CandyBar : Snack()

class VendingMachine<out T : Snack>(private val snack: T) {
    fun purchase(money: Coin): T = snack
}

// ------------------------------------------------------------------------
// Listing 19.17 - The code from Listing 19.14 now compiles without errors.
// ------------------------------------------------------------------------

val candyBarMachine: VendingMachine<CandyBar> = VendingMachine(CandyBar())
val vendingMachine: VendingMachine<Snack> = candyBarMachine
