package listing_07_03

val taxMultiplier = 1.09

// ---------------------------------------------------------------------
// Listing 7.3 - One function for a $5 coupon, and one for a 10% coupon.
// ---------------------------------------------------------------------

fun calculateTotalWithFiveDollarDiscount(initialPrice: Double): Double {
    val priceAfterDiscount = initialPrice - 5.0
    val total = priceAfterDiscount * taxMultiplier

    return total
}

fun calculateTotalWithTenPercentDiscount(initialPrice: Double): Double {
    val priceAfterDiscount = initialPrice * 0.9
    val total = priceAfterDiscount * taxMultiplier

    return total
}
