package listing_04_12

// -----------------------------------------------------------------------------------------
// Listing 4.12 - Making `pi` private, so that it is only visible from within the class body
// -----------------------------------------------------------------------------------------

class Circle(var radius: Double) {
    private val pi: Double = 3.14
}
