package listing_19_31

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

// ---------------------------------------------------------------------------
// Listing 19.31 - A function with a parameter whose type is an in-projection.
// ---------------------------------------------------------------------------

fun getRefundFrom(machine: VendingMachine<in CandyBar>): Money {
    return machine.refund(CandyBar())
}
