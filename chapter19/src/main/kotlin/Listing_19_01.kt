package listing_19_01

class Coin
class Snack
fun randomSnack() = Snack()

// ----------------------------------------------------------------------------------------------------------
// Listing 19.1 - A simple `VendingMachine` class that accepts a `Coin` and returns a `Snack`.
// ----------------------------------------------------------------------------------------------------------

open class VendingMachine {
    open fun purchase(money: Coin): Snack = randomSnack()
}
