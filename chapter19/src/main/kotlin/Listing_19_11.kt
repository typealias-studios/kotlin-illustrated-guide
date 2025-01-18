package listing_19_11

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

class AnyMoneyVendingMachine : VendingMachine() {
    override val purchase: (Money) -> Snack = { randomSnack() }
}

// -------------------------------------------------------------------------------------------------
// Listing 19.11 - The object's type affects which argument types the `purchase()` function accepts.
// -------------------------------------------------------------------------------------------------

fun main() {
    val vendingMachine: VendingMachine = AnyMoneyVendingMachine()
    val anyMoneyMachine: AnyMoneyVendingMachine = AnyMoneyVendingMachine()
    
    val snack1: Snack = vendingMachine.purchase(Dime())
    val snack2: Snack = anyMoneyMachine.purchase(Dime())
    val snack3: Snack = anyMoneyMachine.purchase(OneDollarBill())
}
