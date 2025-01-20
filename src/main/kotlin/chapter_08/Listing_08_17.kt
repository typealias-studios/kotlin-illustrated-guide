package listing_08_17

val booksToRead = listOf(
    "Tea with Agatha",
    "Mystery on First Avenue",
    "The Ravine of Sorrows",
    "The Kingsford Manor Mystery",
    "Beyond the Expanse"
)

// ----------------------------------------------------------------------------------------------------
// Listing 8.17 - Using `map()` to create a list without the word "The" at the beginning of the titles.
// ----------------------------------------------------------------------------------------------------

fun main() {
    val sortableTitles = booksToRead.map { title -> 
        title.removePrefix("The ") 
    }
}
