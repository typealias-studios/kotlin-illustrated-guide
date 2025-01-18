package listing_04_16

class Circle(var radius: Double) {
    private val pi: Double = 3.14

    fun circumference() = 2 * pi * radius
}

// ----------------------------------------------
// Listing 4.16 - Calling a function on an object
// ----------------------------------------------

fun main() {
    val smallCircle = Circle(5.2)
    val circumferenceOfSmallCircle: Double = smallCircle.circumference()
}
