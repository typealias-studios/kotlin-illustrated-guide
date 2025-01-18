package listing_08_05

// ----------------------------------------------------------------------------
// Listing 8.5 - Creating a new list that combines a list with one new element.
// ----------------------------------------------------------------------------

val booksToRead = listOf(
    "Tea with Agatha",
    "Mystery on First Avenue",
    "The Ravine of Sorrows",
    "Among the Aliens",
    "The Kingsford Manor Mystery",
)

val newBooksToRead = booksToRead + "Beyond the Expanse"
