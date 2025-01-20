package listing_11_11

// -----------------------------------------------------------
// Listing 11.11 - Code assembled from listings in Chapter 10.
// -----------------------------------------------------------

fun main() {
    fun String.singleQuoted() = "'$this'"
    
    val title = "The Robots from Planet X3"
    val newTitle = title
        .removePrefix("The ")
        .singleQuoted()
        .uppercase()
    
    // 'ROBOTS FROM PLANET X3'
}
