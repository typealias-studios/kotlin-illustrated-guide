package listing_19_06

open class Money
class Coin : Money()

open class Product
open class Snack : Product()
class CandyBar : Snack()

fun randomSnack(): Snack = CandyBar()
fun randomToyOrSnack(): Product = Snack()

class CandyBarMachine : VendingMachine() {
    override fun purchase(money: Coin): CandyBar = CandyBar()
}

open class VendingMachine {
    open fun purchase(money: Coin): Snack = randomSnack()
}

// --------------------------------------------------
// Listing 19.6 - Error: 'purchase' overrides nothing
// --------------------------------------------------

class AnyMoneyVendingMachine : VendingMachine() {
    // override fun purchase(money: Money): Snack = randomSnack()
}
