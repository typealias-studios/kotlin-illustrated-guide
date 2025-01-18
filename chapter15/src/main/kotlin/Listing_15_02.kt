package listing_15_02

class Child(val name: String)

// -------------------------------------------------------------------------------------
// Listing 15.2 - Two variables are considered equal when they refer to the same object.
// -------------------------------------------------------------------------------------

fun main() {
    val fiona1 = Child("Fiona")
    val fiona2 = fiona1

    println(fiona1 == fiona2) // true
}
