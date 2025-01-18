// -------------------------------------------
// Listing 3.1 - A `when` expression in Kotlin
// -------------------------------------------

fun main() {
	val temperature = 48
	
	val reaction = when {
	    temperature > 55 -> "It's too hot!"
	    temperature < 40 -> "It's too cold!"
	    else             -> "It's just right!"
	}
}
