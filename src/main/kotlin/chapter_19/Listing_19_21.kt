package listing_19_21

open class Money
open class Coin : Money()
class Dime : Coin()
class OneDollarBill : Money()

open class Product
open class Snack : Product()
class CandyBar : Snack()

fun randomSnack() = CandyBar()

// -----------------------------------------------------------------------
// Listing 19.21 - Adding an `in` variance modifier to the type parameter.
// -----------------------------------------------------------------------

class VendingMachine<in T : Money> {
    fun purchase(money: T): Snack = randomSnack()
}
