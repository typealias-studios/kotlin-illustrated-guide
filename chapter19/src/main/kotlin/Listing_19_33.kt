package listing_19_33

open class Money
open class Coin : Money()
class Dime : Coin()
class OneDollarBill : Money()

open class Product
open class Snack : Product()
class CandyBar : Snack()

class VendingMachine<T : Snack>(private val snack: T) {
    fun purchase(money: Coin): T = snack
    fun refund(snack: T): Coin = Dime()
    fun tune() = println("All tuned up!")
}

// ----------------------------------------------------------------------------
// Listing 19.33 - A function with a parameter whose type is a star-projection.
// ----------------------------------------------------------------------------

fun service(machine: VendingMachine<*>) {
    print("Tuning up $machine... ")
    machine.tune()
}
