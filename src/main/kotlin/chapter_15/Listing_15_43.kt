package listing_15_43

data class DollarBill(val amount: Int) {
    var serialNumber: String? = null
}

// ---------------------------------------------------------------------------
// Listing 15.43 - Demonstrating that `serialNumber` does not affect equality.
// ---------------------------------------------------------------------------

fun main() {
    val bill1 = DollarBill(5).apply { serialNumber = "QB12345678T" }
    val bill2 = DollarBill(5).apply { serialNumber = "IE87654321C" }

    println(bill1 == bill2) // true, despite different serial numbers
}
