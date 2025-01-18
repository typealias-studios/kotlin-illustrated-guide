package listing_19_10

open class Money
class Coin : Money()

open class Product
open class Snack : Product()
class CandyBar : Snack()

fun randomSnack(): Snack = CandyBar()

open class VendingMachine {
    open val purchase: (Coin) -> Snack = { randomSnack() }
}

// -----------------------------------------------------------------
// Listing 19.10 - Replacing the parameter with a more general type.
// -----------------------------------------------------------------

class AnyMoneyVendingMachine : VendingMachine() {
    override val purchase: (Money) -> Snack = { randomSnack() }
}
