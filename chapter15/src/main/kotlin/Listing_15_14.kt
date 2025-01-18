package listing_15_14

// -----------------------------------------------------
// Listing 15.14 - Overriding the `toString()` function.
// -----------------------------------------------------

class DollarBill(val amount: Int) {
    override fun equals(other: Any?) =
        if (other is DollarBill) amount.equals(other.amount) else false

    override fun hashCode() = amount.hashCode()

    override fun toString() = "DollarBill(amount=$amount)"
}
