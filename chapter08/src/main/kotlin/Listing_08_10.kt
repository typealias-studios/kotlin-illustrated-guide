package listing_08_10

// --------------------------------------------------------------------------------------
// Listing 8.10 - Using the `get()` function to get a single element out of a collection.
// --------------------------------------------------------------------------------------

fun main() {
    val booksToRead = listOf(
        "Tea with Agatha",
        "Mystery on First Avenue",
        "The Ravine of Sorrows",
        "The Kingsford Manor Mystery",
        "Beyond the Expanse"
    )
    
    val firstBook = booksToRead.get(0)
    println(firstBook) // Tea with Agatha
}
