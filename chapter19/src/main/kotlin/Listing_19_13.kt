package listing_19_13

open class Money
open class Coin : Money()
class Dime : Coin()
class OneDollarBill : Money()

open class Product
open class Snack : Product()
class CandyBar : Snack()

// ----------------------------------------------------------------
// Listing 19.13 - A generic version of the `VendingMachine` class.
// ----------------------------------------------------------------

class VendingMachine<T : Snack>(private val snack: T) {
    fun purchase(money: Coin): T = snack
}
