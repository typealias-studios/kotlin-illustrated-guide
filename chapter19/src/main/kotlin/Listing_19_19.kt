package listing_19_19

open class Money
open class Coin : Money()
class Dime : Coin()
class OneDollarBill : Money()

open class Product
open class Snack : Product()
class CandyBar : Snack()

fun randomSnack() = CandyBar()

// ----------------------------------------------------------------------------------------
// Listing 19.19 - Changing the type parameter to represent the money instead of the snack.
// ----------------------------------------------------------------------------------------

class VendingMachine<T : Money> {
    fun purchase(money: T): Snack = randomSnack()
}
