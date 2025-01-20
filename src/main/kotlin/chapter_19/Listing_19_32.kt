package listing_19_32

open class Money
open class Coin : Money()
class Dime : Coin()
class OneDollarBill : Money()

open class Product
open class Snack : Product()
class CandyBar : Snack()

// ------------------------------------------------------------------------
// Listing 19.32 -  Adding a function that does not use the type parameter.
// ------------------------------------------------------------------------

class VendingMachine<T : Snack>(private val snack: T) {
    fun purchase(money: Coin): T = snack
    fun refund(snack: T): Coin = Dime()
    fun tune() = println("All tuned up!")
}
