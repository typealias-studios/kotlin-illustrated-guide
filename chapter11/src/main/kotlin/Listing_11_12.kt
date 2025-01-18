package listing_11_12

// ------------------------------------------------------------------------------------------------------
// Listing 11.12 - Replacing the `singleQuoted()` extension function with a call to the `run()` function.
// ------------------------------------------------------------------------------------------------------

fun main() {
    val title = "The Robots from Planet X3"
    val newTitle = title
        .removePrefix("The ")
        .run { "'$this'" }
        .uppercase()
    
    // 'ROBOTS FROM PLANET X3'
}
