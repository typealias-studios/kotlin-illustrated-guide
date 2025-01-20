package listing_04_13

class Circle(var radius: Double) {
    private val pi: Double = 3.14
}

// --------------------------------------------------------------------------------------
// Listing 4.13 - Error: Cannot access 'pi': it is private in 'Circle' (does not compile)
// --------------------------------------------------------------------------------------

fun main() {
    val smallCircle = Circle(5.2)
    
    val radiusOfSmallCircle = smallCircle.radius
    // val piFromSmallCircle = smallCircle.pi
}
