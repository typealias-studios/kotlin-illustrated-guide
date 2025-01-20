package listing_07_21

// -----------------------------------------------------------------------------------
// Listing 7.21 - Code from Listing 7.5 and 7.7 (with some changes to type inference).
// -----------------------------------------------------------------------------------

fun discountFiveDollars(price: Double) = price - 5.0
val applyDiscount: (Double) -> Double = ::discountFiveDollars
