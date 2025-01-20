package listing_19_26

open class Money
open class Coin : Money()
class Dime : Coin()
class OneDollarBill : Money()

open class Product
open class Snack : Product()
class CandyBar : Snack()

// ---------------------------------------------------------------------------------
// Listing 19.26 - Adding the `refund()` function to our new `VendingMachine` class.
// ---------------------------------------------------------------------------------

class VendingMachine<T : Product>(private val product: T) {
    fun purchase(money: Money): T = product
    fun refund(product: T): Money = Dime()
}
