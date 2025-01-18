package listing_15_03

// -----------------------------------------------------------------------------------------------
// Listing 15.3 - How can we make it so that two objects are equal based on their property values?
// -----------------------------------------------------------------------------------------------

fun main() {
    class DollarBill(val amount: Int)
    
    val bill1 = DollarBill(5)
    val bill2 = DollarBill(5)
    
    // We want this to be true!
    println(bill1 == bill2) // false
}
