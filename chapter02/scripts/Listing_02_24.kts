val pi = 3.14

// -----------------------------------------------------------------
// Listing 2.24 - Error: Unresolved reference: pi (does not compile)
// -----------------------------------------------------------------

fun circumference(radius: Double): Double {
	val pi = 3.14
	return 2 * pi * radius
}

val tau = 2 * pi
