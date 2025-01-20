package listing_11_08

class Address(
    var street1: String = "", var street2: String = "", var city: String = "",
    var state: String = "", var postalCode: String = ""
)

val address = Address()

// ---------------------------------------------------------------
// Listing 11.8 - Updating many properties of an `address` object.
// ---------------------------------------------------------------

fun main() {
    address.street1 = "9801 Maple Ave"
    address.street2 = "Apartment 255"
    address.city = "Rocksteady"
    address.state = "IN"
    address.postalCode = "12345"
}
