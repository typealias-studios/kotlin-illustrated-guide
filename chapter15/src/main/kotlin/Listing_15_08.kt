package listing_15_08

class DollarBill(val amount: Int) {
    override fun equals(other: Any?) =
        if (other is DollarBill) amount.equals(other.amount) else false
}

// -------------------------------------------------------------------------
// Listing 15.8 - Adding three unique `DollarBill` objects to a mutable set.
// -------------------------------------------------------------------------

fun main() {
    val denominations = mutableSetOf<DollarBill>()
    
    denominations.add(DollarBill(1))
    denominations.add(DollarBill(2))
    denominations.add(DollarBill(5))
    
    println(denominations.size) // 3
}
