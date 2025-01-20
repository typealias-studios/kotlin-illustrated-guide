package listing_11_16

fun String?.singleQuoted() =
    if (this == null) "(no value)" else "'$this'"

// ---------------------------------------------------------
// Listing 11.16 - Using `also()` with a function reference.
// ---------------------------------------------------------

fun main() {
    val title = "The Robots from Planet X3"
    val newTitle = title
        .removePrefix("The ")
        .also(::println) // Robots from Planet X3
        .singleQuoted()
        .uppercase()
    
    // 'ROBOTS FROM PLANET X3'
}
