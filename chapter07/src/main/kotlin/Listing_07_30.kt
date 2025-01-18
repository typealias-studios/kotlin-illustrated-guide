package listing_07_30

fun discountFiveDollars(price: Double): Double = price - 5.0
fun discountTenPercent(price: Double): Double = price * 0.9
fun noDiscount(price: Double): Double = price

// -------------------------------------------------------------------------------------
// Listing 7.30 - Returning function references from a function. (Same as Listing 7.18).
// -------------------------------------------------------------------------------------

fun discountForCouponCode(couponCode: String): (Double) -> Double = when (couponCode) {
    "FIVE_BUCKS" -> ::discountFiveDollars
    "TAKE_10"    -> ::discountTenPercent
    else         -> ::noDiscount
}
