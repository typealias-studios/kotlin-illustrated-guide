package listing_19_34

open class Money
open class Coin : Money()
class Dime : Coin()
class OneDollarBill : Money()

open class Product
open class Snack : Product()
class CandyBar : Snack()
class TrailMix : Snack()
class GummyBears : Snack()

class VendingMachine<T : Snack>(private val snack: T) {
    fun purchase(money: Coin): T = snack
    fun refund(snack: T): Coin = Dime()
    fun tune() = println("All tuned up!")
}

fun service(machine: VendingMachine<*>) {
    print("Tuning up $machine... ")
    machine.tune()
}

// ------------------------------------------------------------------------------------------
// Listing 19.34 - Calling the `service()` function with different kinds of vending machines.
// ------------------------------------------------------------------------------------------

fun main() {
    service(VendingMachine(CandyBar()))   // Works with VendingMachine<CandyBar>
    service(VendingMachine(TrailMix()))   // Works with VendingMachine<TrailMix>
    service(VendingMachine(GummyBears())) // Works with VendingMachine<GummyBears>
}
