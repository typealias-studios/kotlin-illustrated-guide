package listing_19_29

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

// ----------------------------------------------------------------------
// Listing 19.29 - Adding the `out` variance modifier to a type argument.
// ----------------------------------------------------------------------

fun getSnackFrom(machine: VendingMachine<out Snack>): Snack {
    return machine.purchase(Dime())
}
