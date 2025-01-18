package listing_19_09

open class Money
class Coin : Money()

open class Product
open class Snack : Product()
class CandyBar : Snack()

fun randomSnack(): Snack = CandyBar()

open class VendingMachine {
    open val purchase: (Coin) -> Snack = { randomSnack() }
}

// ------------------------------------------------------------------
// Listing 19.9 - Overriding the `purchase` property in the subclass.
// ------------------------------------------------------------------

class AnyMoneyVendingMachine : VendingMachine() {
    override val purchase: (Coin) -> Snack = { randomSnack() }
}
