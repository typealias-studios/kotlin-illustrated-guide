package listing_04_17

// --------------------------------------------------------------------------------
// Listing 4.17 - Adding a second function to our class, and calling that function.
// --------------------------------------------------------------------------------

class Circle(var radius: Double) {
    private val pi: Double = 3.14

    fun circumference() = 2 * pi * radius
    fun area() = pi * radius * radius
}

val smallCircle = Circle(5.2)
val areaOfSmallCircle = smallCircle.area()
