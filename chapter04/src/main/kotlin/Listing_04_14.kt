package listing_04_14

// ----------------------------------------------------
// Listing 4.14 - Adding the `circumference()` function
// ----------------------------------------------------

class Circle(var radius: Double) {
    private val pi: Double = 3.14

    fun circumference(radius: Double) = 2 * pi * radius
}
