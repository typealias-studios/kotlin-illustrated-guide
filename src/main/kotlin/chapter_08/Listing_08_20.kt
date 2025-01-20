package listing_08_20

val booksToRead = listOf(
    "Tea with Agatha",
    "Mystery on First Avenue",
    "The Ravine of Sorrows",
    "The Kingsford Manor Mystery",
    "Beyond the Expanse"
)

// -----------------------------------------------------------------------------
// Listing 8.20 - Using the `filter()` function to filter out unwanted elements.
// -----------------------------------------------------------------------------

fun main() {
    val booksForNolan = booksToRead
        .map { title -> title.removePrefix("The ") }
        .sorted()
        .filter { title -> title.contains("Mystery") }
}
