package listing_07_28

// --------------------------------------------------------------------------------------------
// Listing 7.28 - A higher-order function with a single parameter, which is of a function type.
// --------------------------------------------------------------------------------------------

fun printSubtotal(applyDiscount: (Double) -> Double) {
    val result = applyDiscount(20.0)
    val formatted = "$%.2f".format(result)
    println("A $20.00 haircut will cost you $formatted before tax.")
}
