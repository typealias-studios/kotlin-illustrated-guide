package listing_08_07

// ---------------------------------------------------------------
// Listing 8.7 - Adding and removing an element from a collection.
// ---------------------------------------------------------------

fun main() {
    var booksToRead = listOf(
        "Tea with Agatha",
        "Mystery on First Avenue",
        "The Ravine of Sorrows",
        "Among the Aliens",
        "The Kingsford Manor Mystery",
    )
    
    booksToRead = booksToRead + "Beyond the Expanse"
    booksToRead = booksToRead - "Among the Aliens"
}
