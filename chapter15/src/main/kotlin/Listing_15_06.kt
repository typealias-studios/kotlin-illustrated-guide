package listing_15_06

class DollarBill(val amount: Int) {
    override fun equals(other: Any?) =
        if (other is DollarBill) amount.equals(other.amount) else false
}

// ---------------------------------------------------------------------------------------------------------------
// Listing 15.6 - These two `DollarBill` objects are considered equal because we overrode the `equals()` function.
// ---------------------------------------------------------------------------------------------------------------

fun main() {
    val bill1 = DollarBill(5)
    val bill2 = DollarBill(5)
    
    println(bill1 == bill2) // true
}
