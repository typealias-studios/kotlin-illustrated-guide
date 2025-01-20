package listing_03_10

// ---------------------------------------------------------------------------
// Listing 3.10 - An if expression with braces, allowing for statements inside
// ---------------------------------------------------------------------------

fun main() {
	var isLightbulbOn = true
	
	val reaction =
	    if (isLightbulbOn) {
	        isLightbulbOn = false
	        "I just turned the light off."
	    } else {
	        isLightbulbOn = true
	        "I just turned the light on."
	    }
}
