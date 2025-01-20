package listing_03_02

// -----------------------------------------------------------------------------------------
// Listing 3.2 - Adding a fourth branch to a `when` expression, for temperatures below zero.
// -----------------------------------------------------------------------------------------

fun main() {
	val temperature = -5
	
	val reaction = when {
	    temperature > 55 -> "It's too hot!"
	    temperature < 40 -> "It's too cold!"
	    temperature < 0  -> "It's frigid!"
	    else             -> "It's just right!"
	}
}
