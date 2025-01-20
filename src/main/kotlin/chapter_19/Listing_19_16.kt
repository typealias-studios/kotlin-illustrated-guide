package listing_19_16

open class Money
open class Coin : Money()
class Dime : Coin()
class OneDollarBill : Money()

open class Product
open class Snack : Product()
class CandyBar : Snack()

// -------------------------------------------------------------
// Listing 19.16 - Adding an `out` modifier to a type parameter.
// -------------------------------------------------------------

class VendingMachine<out T : Snack>(private val snack: T) {
    fun purchase(money: Coin): T = snack
}
