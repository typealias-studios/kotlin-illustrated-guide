package listing_03_04

// -----------------------------------------------------------------------------------------
// Listing 3.4 - A `when` expression with every condition using the equality operator (`==`)
// -----------------------------------------------------------------------------------------

fun main() {
	val quantity = 3
	
	val pricePerBook = when {
	    quantity == 1 -> 19.99
	    quantity == 2 -> 18.99
	    quantity == 3 -> 16.99
	    quantity == 4 -> 16.99
	    else          -> 14.99
	}
}
