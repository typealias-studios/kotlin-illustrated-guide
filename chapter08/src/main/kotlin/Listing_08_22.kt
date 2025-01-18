package listing_08_22

val booksToRead = listOf(
    "Tea with Agatha",
    "Mystery on First Avenue",
    "The Ravine of Sorrows",
    "The Kingsford Manor Mystery",
    "Beyond the Expanse"
)

// ------------------------------------------------------------------
// Listing 8.22 - Moving the `filter()` call to the top of the chain.
// ------------------------------------------------------------------

fun main() {
    val booksForNolan = booksToRead
        .filter { title -> title.contains("Mystery") }
        .map { title -> title.removePrefix("The ") }
        .sorted()
}
