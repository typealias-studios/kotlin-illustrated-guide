package listing_08_19

val booksToRead = listOf(
    "Tea with Agatha",
    "Mystery on First Avenue",
    "The Ravine of Sorrows",
    "The Kingsford Manor Mystery",
    "Beyond the Expanse"
)

// ------------------------------------------------------------------------------
// Listing 8.19 - Formatting multiple collection operations so that they line up.
// ------------------------------------------------------------------------------

fun main() {
    val sortedTitles = booksToRead
        .map { title -> title.removePrefix("The ") }
        .sorted()
}
