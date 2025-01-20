package listing_15_07

class DollarBill(val amount: Int) {
    override fun equals(other: Any?) =
        if (other is DollarBill) amount.equals(other.amount) else false
}

// ----------------------------------------------------------------------------
// Listing 15.7 - Creating a mutable set to hold unique `DollarBill` instances.
// ----------------------------------------------------------------------------

fun main() {
    val denominations = mutableSetOf<DollarBill>()
}
