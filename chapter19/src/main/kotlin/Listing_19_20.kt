package listing_19_20

open class Money
open class Coin : Money()
class Dime : Coin()
class OneDollarBill : Money()

open class Product
open class Snack : Product()
class CandyBar : Snack()

fun randomSnack() = CandyBar()

class VendingMachine<T : Money> {
    fun purchase(money: T): Snack = randomSnack()
}

// ---------------------------------------------------------------------------------------------------
// Listing 19.20 - Error: Type Mismatch. Required: VendingMachine<Coin>. Found: VendingMachine<Money>.
// ---------------------------------------------------------------------------------------------------

val moneyVendingMachine: VendingMachine<Money> = VendingMachine()
// val coinVendingMachine: VendingMachine<Coin> = moneyVendingMachine
