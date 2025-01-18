package listing_19_15

open class Money
open class Coin : Money()
class Dime : Coin()
class OneDollarBill : Money()

open class Product
open class Snack : Product()
class CandyBar : Snack()

// ---------------------------------------------------------------------------
// Listing 19.15 - Adding a `refund()` function to the `VendingMachine` class.
// ---------------------------------------------------------------------------

class VendingMachine<T : Snack>(private val snack: T) {
    fun purchase(money: Coin): T = snack
    fun refund(snack: T): Coin = Dime()
}
