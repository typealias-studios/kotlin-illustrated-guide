package listing_19_28

open class Money
open class Coin : Money()
class Dime : Coin()
class OneDollarBill : Money()

open class Product
open class Snack : Product()
class CandyBar : Snack()

class VendingMachine<T : Product>(private val product: T) {
    fun purchase(money: Money): T = product
    fun refund(product: T): Money = Dime()
}

fun getSnackFrom(machine: VendingMachine<Snack>): Snack {
    return machine.purchase(Dime())
}

// -------------------------------------------------------------------------------------------------------
// Listing 19.28 - Error: Type Mismatch. Required: VendingMachine<Snack>; Found: VendingMachine<CandyBar>.
// -------------------------------------------------------------------------------------------------------

fun main() {
    val candyBarMachine: VendingMachine<CandyBar> = VendingMachine(CandyBar())
    // getSnackFrom(candyBarMachine)
}
