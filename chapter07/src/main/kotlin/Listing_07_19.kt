package listing_07_19

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

fun discountFiveDollars(price: Double): Double = price - 5.0
fun discountTenPercent(price: Double): Double = price * 0.9
fun noDiscount(price: Double): Double = price

fun discountForCouponCode(couponCode: String): (Double) -> Double = when (couponCode) {
    "FIVE_BUCKS" -> ::discountFiveDollars
    "TAKE_10"    -> ::discountTenPercent
    else         -> ::noDiscount
}

// ------------------------------------------------------------------------------------------
// Listing 7.19 - Rewriting the second half of Listing 7.17 to use `discountForCouponCode()`.
// ------------------------------------------------------------------------------------------

fun main() {
    val withFiveDollarsOff = calculateTotal(20.0, discountForCouponCode("FIVE_BUCKS")) // $16.35
    val withTenPercentOff  = calculateTotal(20.0, discountForCouponCode("TAKE_10"))    // $19.62
    val fullPrice          = calculateTotal(20.0, discountForCouponCode("NONE"))       // $21.80
}
