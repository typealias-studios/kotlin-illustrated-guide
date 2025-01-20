package listing_10_04

fun singleQuoted(original: String) = "'$original'"
val title = "The Robots from Planet X3"

// --------------------------------------------------------------------------------------------------------------------------------
// Listing 10.4 - Calling three functions to change a string - two functions are on an object and another is a standalone function.
// --------------------------------------------------------------------------------------------------------------------------------

fun main() {
    singleQuoted(title.removePrefix("The ")).uppercase()
}
