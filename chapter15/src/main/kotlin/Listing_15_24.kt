package listing_15_24

data class Book(val title: String, val price: Int)

// -------------------------------------------------------------------------------------
// Listing 15.24 - Instantiating a second `Book` variable with the title from the first.
// -------------------------------------------------------------------------------------

fun main() {
    val book = Book("The Malt Shop Caper", 18)
    
    // The price just went up!
    val newBook = Book(book.title, 20)
}
