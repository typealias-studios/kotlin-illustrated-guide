package listing_11_06

val pi = 3.14

// --------------------------------------------------------------
// Listing 11.6 - Error: Variable `diameter` must be initialized.
// --------------------------------------------------------------

class Circle(val radius: Double) {
    // val circumference = pi * diameter
    val diameter = radius * 2
}
