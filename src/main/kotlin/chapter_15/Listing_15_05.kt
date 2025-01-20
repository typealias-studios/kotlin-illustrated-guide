package listing_15_05

// --------------------------------------------------------------------------------------
// Listing 15.5 - Properly overriding the `equals()` function to achieve value equality. 
// --------------------------------------------------------------------------------------

class DollarBill(val amount: Int) {
    override fun equals(other: Any?) =
        if (other is DollarBill) amount.equals(other.amount) else false
}
