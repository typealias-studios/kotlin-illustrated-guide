package listing_19_27

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

// ------------------------------------------------------------------
// Listing 19.27 - A function that accepts a `VendingMachine<Snack>`.
// ------------------------------------------------------------------

fun getSnackFrom(machine: VendingMachine<Snack>): Snack {
    return machine.purchase(Dime())
}
