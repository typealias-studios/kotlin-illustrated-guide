package listing_15_18

data class DollarBill(val amount: Int)

// -----------------------------------------------------------------------------------------------------
// Listing 15.18 - Demonstrating that a data class accomplishes everything that our three overrides did.
// -----------------------------------------------------------------------------------------------------

fun main() {
    val bill1 = DollarBill(100)
    val bill2 = DollarBill(100)
    
    bill1 == bill2                  // true
    mutableSetOf(bill1, bill2).size // 1
    println(bill1)                  // DollarBill(amount=100)
}
