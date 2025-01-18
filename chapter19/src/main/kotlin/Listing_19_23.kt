package listing_19_23

open class Money
open class Coin : Money()
class Dime : Coin()
class OneDollarBill : Money()

open class Product
open class Snack : Product()
class CandyBar : Snack()

fun randomSnack() = CandyBar()

// ---------------------------------------------------------------------------------------------------
// Listing 19.23 - Error: Type parameter T is declared as 'in' but occurs in 'out' position in type T.
// ---------------------------------------------------------------------------------------------------

class VendingMachine<in T : Money>(private val money: T) {
    fun purchase(money: T): Snack = randomSnack()
    // fun refund(snack: Snack): T = money
}
