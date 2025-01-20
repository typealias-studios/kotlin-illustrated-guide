package listing_08_13

val booksToRead = listOf(
    "Tea with Agatha",
    "Mystery on First Avenue",
    "The Ravine of Sorrows",
    "The Kingsford Manor Mystery",
    "Beyond the Expanse"
)

// -------------------------------------------------------
// Listing 8.13 - Using `forEach()` to print each element.
// -------------------------------------------------------

fun main() {
    booksToRead.forEach { element -> 
        println(element)
    }
}
