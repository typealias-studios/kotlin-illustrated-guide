package listing_07_13

// -------------------------------------------------------------------------
// Listing 7.13 - Assigning and reassigning a function to a single variable.
// -------------------------------------------------------------------------

fun main() {
    fun discountFiveDollars(price: Double): Double = price - 5.0
    fun discountTenPercent(price: Double): Double = price * 0.9
    
    var applyDiscount = ::discountFiveDollars
    applyDiscount = ::discountTenPercent
}
