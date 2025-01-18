package listing_07_33

val taxMultiplier = 1.09

// ---------------------------------------
// Listing 7.33 - Putting it all together.
// ---------------------------------------

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

fun discountForCouponCode(couponCode: String): (Double) -> Double = when (couponCode) {
    "FIVE_BUCKS" -> { price -> price - 5.0 }
    "TAKE_10"    -> { price -> price * 0.9 }
    else         -> { price -> price }
}

val initialPrice = 20.0
val couponDiscount = discountForCouponCode("FIVE_BUCKS")
val total = calculateTotal(initialPrice, couponDiscount)
