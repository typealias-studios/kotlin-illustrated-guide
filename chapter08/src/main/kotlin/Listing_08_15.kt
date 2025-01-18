package listing_08_15

// ---------------------------------------------------------
// Listing 8.15 - Using `removePrefix()` on a single string.
// ---------------------------------------------------------

fun main() {
    val sortableTitle = "The Kingsford Manor Mystery".removePrefix("The ")
    
    println(sortableTitle) // Kingsford Manor Mystery
}
