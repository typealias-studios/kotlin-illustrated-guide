package listing_08_24

// ------------------------------------------------------------------------------------------------------------------------
// Listing 8.24 - Adding an element to a set that already contains that element. The set does not include it a second time.
// ------------------------------------------------------------------------------------------------------------------------

fun main() {
    val booksBySlim: MutableSet<String> = mutableSetOf(
        "The Malt Shop Caper",
        "Who is Mrs. W?",
        "At Midnight or Later",
    )
    
    booksBySlim.add("The Malt Shop Caper")
    
    println(booksBySlim)
    // [The Malt Shop Caper, Who is Mrs. W?, At Midnight or Later]
}
