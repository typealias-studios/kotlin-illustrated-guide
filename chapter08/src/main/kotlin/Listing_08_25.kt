package listing_08_25

// -------------------------------------------------
// Listing 8.25 - Converting between lists and sets.
// -------------------------------------------------

fun main() {
    val bookList = listOf(
        "The Malt Shop Caper",
        "At Midnight or Later",
        "The Malt Shop Caper",
    )
    
    val bookSet = bookList.toSet()         // bookSet has two elements
    val anotherBookList = bookSet.toList() // anotherBookList also has two elements
}
