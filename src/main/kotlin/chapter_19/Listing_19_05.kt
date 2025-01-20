package listing_19_05

class Coin

open class Product
open class Snack : Product()
class CandyBar : Snack()

fun randomSnack(): Snack = CandyBar()
fun randomToyOrSnack(): Product = Snack()

class CandyBarMachine : VendingMachine() {
    override fun purchase(money: Coin): CandyBar = CandyBar()
}

// ------------------------------------------------------------
// Listing 19.5 - The `VendingMachine` class from Listing 19.1.
// ------------------------------------------------------------

open class VendingMachine {
    open fun purchase(money: Coin): Snack = randomSnack()
}
