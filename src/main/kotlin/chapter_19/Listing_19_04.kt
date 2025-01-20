package listing_19_04

class Coin

open class Product
open class Snack : Product()
class CandyBar : Snack()

fun randomSnack(): Snack = CandyBar()
fun randomToyOrSnack(): Product = Snack()

open class VendingMachine {
    open fun purchase(money: Coin): Snack = randomSnack()
}

class CandyBarMachine : VendingMachine() {
    override fun purchase(money: Coin): CandyBar = CandyBar()
}

// ------------------------------------------------------------------------------------
// Listing 19.4 - Error: Return type is 'Product', which is not a subtype of overridden
// ------------------------------------------------------------------------------------

class ToyOrSnackMachine : VendingMachine() {
    // override fun purchase(money: Coin): Product = randomToyOrSnack()
}
