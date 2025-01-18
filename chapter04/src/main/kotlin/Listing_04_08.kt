package listing_04_08

class Circle(var radius: Double, val pi: Double)

// -----------------------------------------------------------------------------------
// Listing 4.8 - Providing the value of the `pi` property when calling the constructor
// -----------------------------------------------------------------------------------

fun main() {
    val smallCircle = Circle(5.2, 3.14)
    val mediumCircle = Circle(6.7, 3.14)
    val largeCircle = Circle(10.0, 3.14)
}
