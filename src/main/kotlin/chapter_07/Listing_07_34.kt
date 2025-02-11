package listing_07_34

// ----------------------------------------
// Listing 7.34 - Adding more coupon codes.
// ----------------------------------------

fun discount(couponCode: String): (Double) -> Double = when (couponCode) {
    "FIVE_BUCKS" -> { price -> price - 5.0 }
    "NINE_BUCKS" -> { price -> price - 9.0 }
    "TAKE_10"    -> { price -> price * 0.9 }
    "TAKE_15"    -> { price -> price * 0.85 }
    else         -> { price -> price }
}
