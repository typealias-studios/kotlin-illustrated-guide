package listing_07_16

val taxMultiplier = 1.09

// ------------------------------------------------------------
// Listing 7.16 - A working version of the code in Listing 7.4.
// ------------------------------------------------------------

fun calculateTotal(
    initialPrice: Double,
    applyDiscount: (Double) -> Double
): Double {
    // Apply coupon discount
    val priceAfterDiscount = applyDiscount(initialPrice)
    // Apply tax
    val total = priceAfterDiscount * taxMultiplier

    return total
}
