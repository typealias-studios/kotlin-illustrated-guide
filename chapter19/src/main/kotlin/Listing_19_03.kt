package listing_19_03

class Coin

open class Snack
class CandyBar : Snack()

fun randomSnack() = Snack()

open class VendingMachine {
    open fun purchase(money: Coin): Snack = randomSnack()
}

// --------------------------------------------------------------------------------
// Listing 19.3 - Declaring that `CandyBarMachine` only returns `CandyBar` objects.
// --------------------------------------------------------------------------------

class CandyBarMachine : VendingMachine() {
    override fun purchase(money: Coin): CandyBar = CandyBar()
}
