package listing_04_06

class Circle(var radius: Double)

// -------------------------------------------
// Listing 4.6 - Getting the value of `radius`
// -------------------------------------------

fun main() {
    val smallCircle = Circle(5.2)
    val radiusOfSmallCircle: Double = smallCircle.radius
}
