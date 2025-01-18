package listing_19_08

open class Money
class Coin : Money()

open class Product
open class Snack : Product()
class CandyBar : Snack()

fun randomSnack(): Snack = CandyBar()

// -------------------------------------------------------------------------
// Listing 19.8 - Rewriting `purchase()` as a property with a function type.
// -------------------------------------------------------------------------

open class VendingMachine {
    open val purchase: (Coin) -> Snack = { randomSnack() }
}
