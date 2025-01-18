package listing_19_22

open class Money
open class Coin : Money()
class Dime : Coin()
class OneDollarBill : Money()

open class Product
open class Snack : Product()
class CandyBar : Snack()

fun randomSnack() = CandyBar()

class VendingMachine<in T : Money> {
    fun purchase(money: T): Snack = randomSnack()
}

// ----------------------------------------------------------------------------
// Listing 19.22 - The code from Listing 19.20 now compiles without any errors.
// ----------------------------------------------------------------------------

val moneyVendingMachine: VendingMachine<Money> = VendingMachine()
val coinVendingMachine: VendingMachine<Coin> = moneyVendingMachine
