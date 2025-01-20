package listing_03_06

// -----------------------------------------------------------------------
// Listing 3.6 - Separating multiple matching values (`3, 4`) with a comma
// -----------------------------------------------------------------------

fun main() {
	val quantity = 3
	
	val pricePerBook = when (quantity) {
	    1    -> 19.99
	    2    -> 18.99
	    3, 4 -> 16.99
	    else -> 14.99
	}
}
