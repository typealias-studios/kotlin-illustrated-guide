package listing_19_14

open class Money
open class Coin : Money()
class Dime : Coin()
class OneDollarBill : Money()

open class Product
open class Snack : Product()
class CandyBar : Snack()

class VendingMachine<T : Snack>(private val snack: T) {
    fun purchase(money: Coin): T = snack
}

// -------------------------------------------------------------------------------------------------------
// Listing 19.14 - Error: Type Mismatch. Required: VendingMachine<Snack>. Found: VendingMachine<CandyBar>.
// -------------------------------------------------------------------------------------------------------

val candyBarMachine: VendingMachine<CandyBar> = VendingMachine(CandyBar())
// val vendingMachine: VendingMachine<Snack> = candyBarMachine
