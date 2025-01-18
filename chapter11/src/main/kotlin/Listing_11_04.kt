package listing_11_04

val pi = 3.14

// ----------------------------------------------------------------------------------------
// Listing 11.4 - Declaring the `diameter()` function before using it in a statement scope.
// ----------------------------------------------------------------------------------------

class Circle(val radius: Double) {
    fun circumference(): Double {
        fun diameter() = radius * 2
        val result = pi * diameter()
        return result
    }
}
