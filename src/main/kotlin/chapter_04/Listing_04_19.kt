package listing_04_19

// -------------------------------------------------------------------------------------------------
// Listing 4.19 - Rewriting the `circumference()` function so that it uses the `diameter()` function
// -------------------------------------------------------------------------------------------------

class Circle(var radius: Double) {
    private val pi: Double = 3.14

    fun circumference() = diameter() * pi
    fun area() = pi * radius * radius
    fun diameter() = 2 * radius
}
