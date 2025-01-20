package listing_07_08

fun discountFiveDollars(price: Double): Double = price - 5.0
val applyDiscount = ::discountFiveDollars

// ----------------------------------------------------------------------------------------------
// Listing 7.8 - Calling `applyDiscount()`, which will run the code from `discountFiveDollars()`.
// ----------------------------------------------------------------------------------------------

fun main() {
    val discountedPrice = applyDiscount(20.0) // Result is 15.0
}
