package listing_07_36

fun dollarAmountDiscount(dollarsOff: Double): (Double) -> Double =
    { price -> price - dollarsOff }

fun percentageDiscount(percentageOff: Double): (Double) -> Double {
    val multiplier = 1.0 - percentageOff
    return { price -> price * multiplier }
}

// -----------------------------------------------------------------
// Listing 7.36 - A small improvement to avoid some duplicated code.
// -----------------------------------------------------------------

fun discountForCouponCode(couponCode: String): (Double) -> Double = when (couponCode) {
    "FIVE_BUCKS" -> dollarAmountDiscount(5.0)
    "NINE_BUCKS" -> dollarAmountDiscount(9.0)
    "TAKE_10"    -> percentageDiscount(0.10)
    "TAKE_15"    -> percentageDiscount(0.15)
    else         -> { price -> price }
}
