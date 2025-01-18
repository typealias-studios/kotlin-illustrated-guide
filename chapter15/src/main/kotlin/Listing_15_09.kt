package listing_15_09

class DollarBill(val amount: Int) {
    override fun equals(other: Any?) =
        if (other is DollarBill) amount.equals(other.amount) else false
}

// ------------------------------------------------------------------------------------------
// Listing 15.9 - The set includes a `DollarBill` with the same amount as another in the set.
// ------------------------------------------------------------------------------------------

fun main() {
    val denominations = mutableSetOf<DollarBill>()
    
    denominations.add(DollarBill(1))
    denominations.add(DollarBill(2))
    denominations.add(DollarBill(5))
    denominations.add(DollarBill(1)) // duplicate entry!
    
    println(denominations.size) // 4
}
