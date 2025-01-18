package listing_08_18

val booksToRead = listOf(
    "Tea with Agatha",
    "Mystery on First Avenue",
    "The Ravine of Sorrows",
    "The Kingsford Manor Mystery",
    "Beyond the Expanse"
)

// -------------------------------------------------
// Listing 8.18 - Combining `map()` with `sorted()`.
// -------------------------------------------------

fun main() {
    val sortedTitles = booksToRead.map { title -> title.removePrefix("The ") }.sorted()
}
