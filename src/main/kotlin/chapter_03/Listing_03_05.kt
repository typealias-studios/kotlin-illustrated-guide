package listing_03_05

// -----------------------------------------
// Listing 3.5 - Using `when` with a subject
// -----------------------------------------

fun main() {
	val quantity = 3
	
	val pricePerBook = when (quantity) {
	    1    -> 19.99
	    2    -> 18.99
	    3    -> 16.99
	    4    -> 16.99
	    else -> 14.99
	}
}
