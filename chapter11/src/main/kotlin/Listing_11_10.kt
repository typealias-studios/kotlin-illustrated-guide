package listing_11_10

class Address(
    var street1: String = "", var street2: String = "", var city: String = "",
    var state: String = "", var postalCode: String = ""
)

val address = Address()

// ------------------------------------------------------------------------------------------------------------
// Listing 11.10 - Using `run()` so that each property assignment does not need to be prefixed with `address`. 
// ------------------------------------------------------------------------------------------------------------

fun main() {
    address.run {
        street1 = "9801 Maple Ave"
        street2 = "Apartment 255"
        city = "Rocksteady"
        state = "IN"
        postalCode = "12345"
    }
}
