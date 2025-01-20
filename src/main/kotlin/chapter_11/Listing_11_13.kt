package listing_11_13

// -----------------------------------------------------------------
// Listing 11.13 - Single-quoting a title with the `let()` function.
// -----------------------------------------------------------------

fun main() {
    val title = "The Robots from Planet X3"
    val newTitle = title
        .removePrefix("The ")
        .let { titleWithoutPrefix -> "'$titleWithoutPrefix'" }
        .uppercase()
    
    // 'ROBOTS FROM PLANET X3'
}
