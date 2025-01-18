package listing_15_13

class DollarBill(val amount: Int) {
    override fun equals(other: Any?) =
        if (other is DollarBill) amount.equals(other.amount) else false

    override fun hashCode() = amount.hashCode()
}

// --------------------------------------------------------------
// Listing 15.13 - Passing an object to the `println()` function.
// --------------------------------------------------------------

fun main() {
    println(DollarBill(100))
}
