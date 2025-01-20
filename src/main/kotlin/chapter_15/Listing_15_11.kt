package listing_15_11

class DollarBill(val amount: Int) {
    override fun equals(other: Any?) =
        if (other is DollarBill) amount.equals(other.amount) else false

    override fun hashCode() = amount.hashCode()
}

// -----------------------------------------------------------------------------------------------------
// Listing 15.11 - The set now omits the duplicate entry, because we overrode the `hashCode()` function.
// -----------------------------------------------------------------------------------------------------

fun main() {
    val denominations = mutableSetOf<DollarBill>()
    
    denominations.add(DollarBill(1))
    denominations.add(DollarBill(2))
    denominations.add(DollarBill(5))
    denominations.add(DollarBill(1)) // duplicate entry!
    
    println(denominations.size) // 3 - Success!
}
