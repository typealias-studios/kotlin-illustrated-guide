package listing_07_07

fun discountFiveDollars(price: Double): Double = price - 5.0

// -------------------------------------------------------------------------------------------
// Listing 7.7 - Assigning the function from Listing 7.5 to a variable called `applyDiscount`.
// -------------------------------------------------------------------------------------------

val applyDiscount = ::discountFiveDollars
