package listing_04_11

class Circle(var radius: Double) {
    val pi: Double = 3.14
}

// ---------------------------------------------------------------------
// Listing 4.11 - Getting the values of the `radius` and `pi` properties
// ---------------------------------------------------------------------

fun main() {
    val smallCircle = Circle(5.2)
    
    val radiusOfSmallCircle = smallCircle.radius
    val piFromSmallCircle = smallCircle.pi
}
