package listing_19_12

open class Money
open class Coin : Money()
class Dime : Coin()
class OneDollarBill : Money()

open class Product
open class Snack : Product()
class CandyBar : Snack()

fun randomSnack(): Snack = CandyBar()

open class VendingMachine {
    open val purchase: (Coin) -> Snack = { randomSnack() }
}

// --------------------------------------------------------------------------------------------------------------
// Listing 19.12 - Error: Property type is (Dime) -> Snack, which is not a subtype of overridden (Coin) -> Snack.
// --------------------------------------------------------------------------------------------------------------

class AnyMoneyVendingMachine : VendingMachine() {
    // override val purchase: (Dime) -> Snack = { randomSnack() }
}
