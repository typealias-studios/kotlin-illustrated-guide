package listing_07_32

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

// --------------------------------------------------------
// Listing 7.32 - A lambda that has multiple lines of code.
// --------------------------------------------------------

val withFiveDollarsOff = calculateTotal(20.0) { price ->
    val result = price - 5.0
    println("Initial price: $price")
    println("Discounted price: $result")
    result
}
