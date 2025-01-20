package listing_10_02

fun singleQuoted(original: String) = "'$original'"

// -----------------------------------------
// Listing 10.2 - Calling a simple function.
// -----------------------------------------

fun main() {
    val title = "The Robots from Planet X3"
    val quotedTitle = singleQuoted(title)
    
    println(quotedTitle) // 'The Robots from Planet X3'
}
