package listing_08_06

// --------------------------------------------------------------------------------
// Listing 8.6 - Reassigning the collection to the existing `booksToRead` variable.
// --------------------------------------------------------------------------------

fun main() {
    var booksToRead = listOf(
        "Tea with Agatha",
        "Mystery on First Avenue",
        "The Ravine of Sorrows",
        "Among the Aliens",
        "The Kingsford Manor Mystery",
    )
    
    booksToRead = booksToRead + "Beyond the Expanse"
}
