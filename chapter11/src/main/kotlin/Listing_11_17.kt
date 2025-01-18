package listing_11_17

fun String?.singleQuoted() =
    if (this == null) "(no value)" else "'$this'"

// -------------------------------------------------------------------------
// Listing 11.17 - Using `apply()` to print out the value in a call chain.
// This works, but most Kotlin developers favor `also()` for this situation.
// -------------------------------------------------------------------------

fun main() {
    val title = "The Robots from Planet X3"
    val newTitle = title
        .removePrefix("The ")
        .apply { println(this) } // Robots from Planet X3
        .singleQuoted()
        .uppercase()
    
    // 'ROBOTS FROM PLANET X3'
}
