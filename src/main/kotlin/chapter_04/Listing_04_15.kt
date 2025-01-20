package listing_04_15

// ----------------------------------------------------------------------------------
// Listing 4.15 - Removing the `radius` parameter from the `circumference()` function
// ----------------------------------------------------------------------------------

class Circle(var radius: Double) {
    private val pi: Double = 3.14

    fun circumference() = 2 * pi * radius
}
