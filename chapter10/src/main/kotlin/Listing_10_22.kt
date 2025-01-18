package listing_10_22

val String.isLong: Boolean
    get() = length > 20

// --------------------------------------------
// Listing 10.22 - Using an extension property.
// --------------------------------------------

fun main() {
    val string = "This string is long enough"
    val isItLong = string.isLong
}
