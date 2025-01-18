package listing_08_21

val booksToRead = listOf(
    "Tea with Agatha",
    "Mystery on First Avenue",
    "The Ravine of Sorrows",
    "The Kingsford Manor Mystery",
    "Beyond the Expanse"
)

// ------------------------------------------------------------------------------------
// Listing 8.21 - Using `map()`, `sorted()`, and `filter()` - copied from Listing 8.20.
// ------------------------------------------------------------------------------------

fun main() {
    val booksForNolan = booksToRead
        .map { title -> title.removePrefix("The ") }
        .sorted()
        .filter { title -> title.contains("Mystery") }
}
