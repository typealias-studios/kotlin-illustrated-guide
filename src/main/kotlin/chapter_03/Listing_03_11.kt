package listing_03_11

private const val quantity = 3

// -----------------------------------------------------------
// Listing 3.11 - How **not** to use `if` and `else` in Kotlin
// -----------------------------------------------------------

fun main() {
	val pricePerBook =
	    if (quantity == 1)
	        19.99
	    else if (quantity == 2)
	        18.99
	    else if (quantity == 3)
	        16.99
	    else if (quantity == 4)
	        16.99
	    else
	        14.99
}
