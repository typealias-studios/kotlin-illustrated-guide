package listing_15_15

class DollarBill(val amount: Int) {
    override fun equals(other: Any?) =
        if (other is DollarBill) amount.equals(other.amount) else false

    override fun hashCode() = amount.hashCode()

    override fun toString() = "DollarBill(amount=$amount)"
}

// ---------------------------------------------------------------
// Listing 15.15 - Calling `println()` with a `DollarBill` object.
// ---------------------------------------------------------------

fun main() {
    println(DollarBill(100))
}
