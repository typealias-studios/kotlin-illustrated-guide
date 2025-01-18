package listing_19_30

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

fun getSnackFrom(machine: VendingMachine<out Snack>): Snack {
    return machine.purchase(Dime())
}

// ----------------------------------------------------------------------
// Listing 19.30 - The code from Listing 19.28 now compiles successfully.
// ----------------------------------------------------------------------

fun main() {
    val candyBarMachine: VendingMachine<CandyBar> = VendingMachine(CandyBar())
    getSnackFrom(candyBarMachine)
}
