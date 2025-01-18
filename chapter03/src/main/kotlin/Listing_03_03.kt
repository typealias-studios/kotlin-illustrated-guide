// -----------------------------------------------------------------------------------------
// Listing 3.3 - Correctly ordering the branches so that the below-zero condition will match
// -----------------------------------------------------------------------------------------

fun main() {
	val temperature = -5
	
	val reaction = when {
	    temperature > 55 -> "It's too hot!"
	    temperature < 0  -> "It's frigid!"
	    temperature < 40 -> "It's too cold!"
	    else             -> "It's just right!"
	}
}
