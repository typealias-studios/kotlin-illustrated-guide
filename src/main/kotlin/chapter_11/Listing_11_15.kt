package listing_11_15

fun String?.singleQuoted() =
    if (this == null) "(no value)" else "'$this'"

// --------------------------------------------------------------------
// Listing 11.15 - Using `also()` in a call chain to print out a value.
// --------------------------------------------------------------------

fun main() {
    val title = "The Robots from Planet X3"
    val newTitle = title
        .removePrefix("The ")
        .also { println(it) } // Robots from Planet X3
        .singleQuoted()
        .uppercase()
    
    // 'ROBOTS FROM PLANET X3'
}
