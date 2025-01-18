package listing_15_20

data class Address(
    val street: String,
    val city: String,
    val postalCode: String
)

// -------------------------------------------------------------
// Listing 15.20 - Using a data class that has three properties.
// -------------------------------------------------------------

fun main() {
    val address1 = Address("123 Maple Ave", "Berrytown", "56789")
    val address2 = Address("123 Maple Ave", "Berrytown", "56789")
    
    address1 == address2                  // true
    mutableSetOf(address1, address2).size // 1
    println(address1)                     // Address(street=123 Maple Ave, city=Berrytown, postalCode=56789)
}
