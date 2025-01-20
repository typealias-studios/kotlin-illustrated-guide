package listing_19_24

open class Money
open class Coin : Money()
class Dime : Coin()
class OneDollarBill : Money()

open class Product
open class Snack : Product()
class CandyBar : Snack()

// ------------------------------------------------------------------
// Listing 19.24 - Variance on multiple type parameters in one class.
// ------------------------------------------------------------------

class VendingMachine<in T : Money, out R: Product>(private val product: R) {
    fun purchase(money: T): R = product
}
