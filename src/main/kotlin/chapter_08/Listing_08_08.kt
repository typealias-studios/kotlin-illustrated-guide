package listing_08_08

var booksToRead = listOf(
    "Tea with Agatha",
    "Mystery on First Avenue",
    "The Ravine of Sorrows",
    "Among the Aliens",
    "The Kingsford Manor Mystery",
)

// --------------------------------------------------------------------------------
// Listing 8.8 - Adding and removing an element from a collection on the same line.
// --------------------------------------------------------------------------------

fun main() {
    booksToRead = booksToRead + "Beyond the Expanse" - "Among the Aliens"
}
