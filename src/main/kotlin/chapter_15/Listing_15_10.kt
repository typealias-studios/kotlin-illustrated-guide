package listing_15_10

// -----------------------------------------------------
// Listing 15.10 - Overriding the `hashCode()` function.
// -----------------------------------------------------

class DollarBill(val amount: Int) {
    override fun equals(other: Any?) =
        if (other is DollarBill) amount.equals(other.amount) else false

    override fun hashCode() = amount.hashCode()
}
