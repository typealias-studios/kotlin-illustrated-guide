package listing_03_09

private const val isLightbulbOn = true

// --------------------------------------------------------
// Listing 3.9 - An `if` expression spanning multiple lines
// --------------------------------------------------------

fun main() {
	val reaction =
	    if (isLightbulbOn)
	        "It's bright"
	    else
	        "I can't see"
}
