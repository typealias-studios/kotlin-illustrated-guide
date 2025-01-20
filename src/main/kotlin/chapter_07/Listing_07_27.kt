package listing_07_27

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

// --------------------------------------------------------------------
// Listing 7.27 - Placing a lambda argument outside of the parentheses.
// --------------------------------------------------------------------

val withFiveDollarsOff = calculateTotal(20.0) { price -> price - 5.0 }
val withTenPercentOff  = calculateTotal(20.0) { price -> price * 0.9 }
val fullPrice          = calculateTotal(20.0) { price -> price }
