package listing_07_06

fun discountFiveDollars(price: Double): Double = price - 5.0

// ----------------------------------------------------
// Listing 7.6 - Calling the function from Listing 7.5.
// ----------------------------------------------------

fun main() {
    val discountedPrice = discountFiveDollars(20.0) // Result is 15.0
}
