package listing_07_35

// -----------------------------------------------
// Listing 7.35 - Functions that create functions.
// -----------------------------------------------

fun dollarAmountDiscount(dollarsOff: Double): (Double) -> Double =
    { price -> price - dollarsOff }

fun percentageDiscount(percentageOff: Double): (Double) -> Double {
    val multiplier = 1.0 - percentageOff
    return { price -> price * multiplier }
}
