package listing_08_09

// --------------------------------------------------------------------
// Listing 8.9 - Creating, adding to, and removing from a mutable list.
// --------------------------------------------------------------------

fun main() {
    val booksToRead: MutableList<String> = mutableListOf(
        "Tea with Agatha",
        "Mystery on First Avenue",
        "The Ravine of Sorrows",
        "Among the Aliens",
        "The Kingsford Manor Mystery",
    )
    
    booksToRead.add("Beyond the Expanse")
    booksToRead.remove("Among the Aliens")
}
