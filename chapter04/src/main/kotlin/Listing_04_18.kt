package listing_04_18

// --------------------------------------------------------------------
// Listing 4.18 - Adding a third function to our class, and calling it.
// --------------------------------------------------------------------

class Circle(var radius: Double) {
    private val pi: Double = 3.14

    fun circumference() = 2 * pi * radius
    fun area() = pi * radius * radius
    fun diameter() = 2 * radius
}

fun main() {
    val smallCircle = Circle(5.2)
    val diameterOfSmallCircle = smallCircle.diameter()
}
