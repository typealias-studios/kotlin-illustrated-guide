package listing_14_05

// ------------------------------------------------------------------
// Listing 14.5 - A simple Circle class that we created in Chapter 4.
// ------------------------------------------------------------------

class Circle(
    var radius: Double
) {
    private val pi: Double = 3.14

    fun circumference() = 2 * pi * radius
}
