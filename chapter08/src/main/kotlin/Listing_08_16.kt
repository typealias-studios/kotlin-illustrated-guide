package listing_08_16

val booksToRead = listOf(
    "Tea with Agatha",
    "Mystery on First Avenue",
    "The Ravine of Sorrows",
    "The Kingsford Manor Mystery",
    "Beyond the Expanse"
)

// ----------------------------------------------------------------------------------------------
// Listing 8.16 - Manually creating a list without the word "The" at the beginning of the titles.
// ----------------------------------------------------------------------------------------------

fun main() {
    val sortableTitles: MutableList<String> = mutableListOf()
     
    booksToRead.forEach { title ->
        sortableTitles.add(title.removePrefix("The "))
    }
    
    sortableTitles.forEach { println(it) }
}
