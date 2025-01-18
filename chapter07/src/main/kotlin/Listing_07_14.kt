package listing_07_14

// --------------------------------------------------------------------------------------
// Listing 7.14 - Assigning functions with different argument names to the same variable.
// --------------------------------------------------------------------------------------

fun main() {
    fun discountFiveDollars(initialPrice: Double): Double = initialPrice - 5.0
    fun discountTenPercent(originalPrice: Double): Double = originalPrice * 0.9
    
    var applyDiscount = ::discountFiveDollars
    applyDiscount = ::discountTenPercent
}
