package listing_07_29

fun printSubtotal(applyDiscount: (Double) -> Double) {
    val result = applyDiscount(20.0)
    val formatted = "$%.2f".format(result)
    println("A $20.00 haircut will cost you $formatted before tax.")
}

// -------------------------------------------------------------
// Listing 7.29 - Calling `printSubtotal()` without parentheses.
// -------------------------------------------------------------

fun main() {
    printSubtotal { price -> price - 5.0 }
    printSubtotal { price -> price * 0.9 }
}
