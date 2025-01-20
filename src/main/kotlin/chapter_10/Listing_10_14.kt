package listing_10_14

fun String.singleQuoted() = "'$this'"

// --------------------------------------------------------------------------------
// Listing 10.14 - Adding a call to `singleQuoted()` in the middle of a call chain.
// --------------------------------------------------------------------------------

fun main() {
    val title = "The Robots from Planet X3"
    val newTitle = title
        .removePrefix("The ")
        .singleQuoted()
        .uppercase()
    
    // 'ROBOTS FROM PLANET X3'
}
