package listing_07_26

val taxMultiplier = 1.09

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

// --------------------------------------------------------------------------------
// Listing 7.26 - Replacing the function references from Listing 7.25 with lambdas.
// --------------------------------------------------------------------------------

val withFiveDollarsOff = calculateTotal(20.0, { price -> price - 5.0 }) // $16.35
val withTenPercentOff  = calculateTotal(20.0, { price -> price * 0.9 }) // $19.62
val fullPrice          = calculateTotal(20.0, { price -> price })       // $21.80
