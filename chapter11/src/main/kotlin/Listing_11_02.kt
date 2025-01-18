package listing_11_02

// ---------------------------------------------------------------
// Listing 11.2 - Adding a `Circle` class to create another scope.
// ---------------------------------------------------------------

val pi = 3.14

class Circle(var radius: Double) {
    val diameter = radius * 2
}
