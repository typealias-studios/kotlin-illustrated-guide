package listing_07_31

// -------------------------------------------------
// Listing 7.31 - Returning lambdas from a function.
// -------------------------------------------------

fun discount(couponCode: String): (Double) -> Double = when (couponCode) {
    "FIVE_BUCKS" -> { price -> price - 5.0 }
    "TAKE_10"    -> { price -> price * 0.9 }
    else         -> { price -> price }
}
