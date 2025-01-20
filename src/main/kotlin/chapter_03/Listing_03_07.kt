package listing_03_07

// -----------------------------------------------------------------------------
// Listing 3.7 - A `when` expression that is exhaustive without an `else` branch
// -----------------------------------------------------------------------------

fun main() {
	val isLightbulbOn = true
	
	val reaction = when (isLightbulbOn) {
	    true  -> "It's bright"
	    false -> "I can't see"
	}
}
