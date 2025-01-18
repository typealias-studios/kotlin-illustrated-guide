package listing_19_02

class Coin

open class Snack
class CandyBar : Snack()

fun randomSnack() = Snack()

open class VendingMachine {
    open fun purchase(money: Coin): Snack = randomSnack()
}

// --------------------------------------------------------------------------------
// Listing 19.2 - Modeling Vinnie’s second vending machine by extending the first.
// --------------------------------------------------------------------------------

class CandyBarMachine : VendingMachine() {
    override fun purchase(money: Coin): Snack = CandyBar()
}
