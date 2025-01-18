package listing_07_10

fun discountFiveDollars(price: Double): Double = price - 5.0

// -----------------------------------------------------------------------------------------------
// Listing 7.10 - Writing the type of `applyDiscount` explicitly rather than using type inference.
// -----------------------------------------------------------------------------------------------

fun main() {
    val applyDiscount: (Double) -> Double = ::discountFiveDollars
}
