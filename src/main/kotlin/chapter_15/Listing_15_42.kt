package listing_15_42

// ------------------------------------------------------------------------------------------------
// Listing 15.42 - This data class includes a property that is not part of the primary constructor.
// ------------------------------------------------------------------------------------------------

data class DollarBill(val amount: Int) {
    var serialNumber: String? = null
}
