package listing_04_10

class Circle(var radius: Double) {
    val pi: Double = 3.14
}

// -----------------------------------------------------------------------------
// Listing 4.10 - We no longer have to pass a second argument to the constructor
// -----------------------------------------------------------------------------

fun main() {
    val smallCircle = Circle(5.2)
}
