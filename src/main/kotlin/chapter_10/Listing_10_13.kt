package listing_10_13

val title = "The Robots from Planet X3"
fun String.singleQuoted() = "'$this'"

// ----------------------------------------------------------------------------------
// Listing 10.13 - How to call `singleQuoted()`, now that it's an extension function.
// ----------------------------------------------------------------------------------

fun main() {
    val quotedTitle = title.singleQuoted()
}
