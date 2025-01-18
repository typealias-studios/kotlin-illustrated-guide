package listing_07_02

val taxMultiplier = 1.09

fun calculateTotalWithFiveDollarDiscount(initialPrice: Double): Double {
    val priceAfterDiscount = initialPrice - 5.0
    val total = priceAfterDiscount * taxMultiplier

    return total
}

// ---------------------------------------------------
// Listing 7.2 - Calling the function from Listing 7.1
// ---------------------------------------------------

fun main() {
    val total = calculateTotalWithFiveDollarDiscount(20.0)
    println("$%.2f".format(total))
}
