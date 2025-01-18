package listing_15_16

// -----------------------------------------------------------------------------------
// Listing 15.16 - The full code for the `DollarBill` class, with all three overrides.
// -----------------------------------------------------------------------------------

class DollarBill(val amount: Int) {
    override fun equals(other: Any?) =
        if (other is DollarBill) amount.equals(other.amount) else false

    override fun hashCode() = amount.hashCode()
    override fun toString() = "DollarBill(amount=$amount)"
}
