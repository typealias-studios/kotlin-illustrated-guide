package listing_11_07

// --------------------------------------------------------------------
// Listing 11.7 - Code that will be used to demonstrate scope crawling.
// --------------------------------------------------------------------

val pi = 3.14

fun main() {
    val radii = listOf(1.0, 2.0, 3.0)

    class Circle(
        val radius: Double
    ) {
        fun circumference(): Double {
            val multiplier = 2.0
            // Which variables are visible here?
            val diameter = radius * multiplier
            return multiplier * pi * radius
        }

        val area = pi * radius * radius
    }

    val areas = radii.map {
        Circle(it).area
    }
}
