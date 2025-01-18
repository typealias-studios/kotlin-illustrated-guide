package listing_04_21

class Circle(var radius: Double) {
    private val pi: Double = 3.14

    // -------------------------------------------------------------------
    // Listing 4.21 - The `circumference()` function, using function calls
    // -------------------------------------------------------------------

    fun circumference() = 2.times(pi).times(radius)

    // -------------------------------------------------------------------

    fun area() = pi * radius * radius
    fun diameter() = 2 * radius
}
