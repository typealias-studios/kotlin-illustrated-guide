package listing_04_20

class Circle(var radius: Double) {
    private val pi: Double = 3.14

    // -------------------------------------------------------------------------
    // Listing 4.20 - The `circumference()` function, using arithmetic operators
    // -------------------------------------------------------------------------

    fun circumference() = 2 * pi * radius

    // -------------------------------------------------------------------------

    fun area() = pi * radius * radius
    fun diameter() = 2 * radius
}
