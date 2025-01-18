package listing_19_25

open class Money
open class Coin : Money()
class Dime : Coin()
class OneDollarBill : Money()

open class Product
open class Snack : Product()
class CandyBar : Snack()

// ---------------------------------------------------------------------------------------------------------
// Listing 19.25 - Updating the `VendingMachine` to work with any kind of `Product` and any kind of `Money`.
// ---------------------------------------------------------------------------------------------------------

class VendingMachine<out T : Product>(private val product: T) {
    fun purchase(money: Money): T = product
}
