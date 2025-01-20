package listing_07_01

// --------------------------------------------------------------------------------
// Listing 7.1 - A simple function to calculate the total cost when using a coupon.
// --------------------------------------------------------------------------------

// Tax is 9%, so we'll multiply by 109% to get the total with tax included.
val taxMultiplier = 1.09

fun calculateTotalWithFiveDollarDiscount(initialPrice: Double): Double {
    val priceAfterDiscount = initialPrice - 5.0
    val total = priceAfterDiscount * taxMultiplier

    return total
}
