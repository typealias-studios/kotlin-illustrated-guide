package listing_08_14

val booksToRead = listOf(
    "Tea with Agatha",
    "Mystery on First Avenue",
    "The Ravine of Sorrows",
    "The Kingsford Manor Mystery",
    "Beyond the Expanse"
)

// ------------------------------------------------------------------
// Listing 8.14 - Using the implicit `it` parameter with `forEach()`.
// ------------------------------------------------------------------

fun main() {
    booksToRead.forEach { println(it) }
}
