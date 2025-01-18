package listing_08_11

val booksToRead = listOf(
    "Tea with Agatha",
    "Mystery on First Avenue",
    "The Ravine of Sorrows",
    "The Kingsford Manor Mystery",
    "Beyond the Expanse"
)

// -----------------------------------------------------------------------------------------------
// Listing 8.11 - Getting a single element out of a collection, using the indexed access operator.
// -----------------------------------------------------------------------------------------------

fun main() {
    val firstBook = booksToRead[0] 
    println(firstBook) // Tea with Agatha
}
