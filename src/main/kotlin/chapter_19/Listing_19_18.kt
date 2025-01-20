package listing_19_18

open class Money
open class Coin : Money()
class Dime : Coin()
class OneDollarBill : Money()

open class Product
open class Snack : Product()
class CandyBar : Snack()

// -------------------------------------------------------------------------------------------
// Listing 19.18 - Error: Type parameter `T` is declared as `out` but occurs in `in` position.
// -------------------------------------------------------------------------------------------

class VendingMachine<out T : Snack>(private val snack: T) {
    fun purchase(money: Coin): T = snack
    // fun refund(snack: T): Coin = Dime()
}
