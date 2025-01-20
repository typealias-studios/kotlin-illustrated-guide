package listing_11_05

val pi = 3.14

// ------------------------------------------------------------------------------------------
// Listing 11.5 - Using the `diameter()` function before declaring it in a declaration scope.
// ------------------------------------------------------------------------------------------

class Circle(val radius: Double) {
    val circumference = pi * diameter()
    fun diameter() = radius * 2
}
