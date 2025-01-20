package listing_15_22

data class Book(val title: String, var price: Int)

// ----------------------------------------------------
// Listing 15.22 - Changing the price of a book object.
// ----------------------------------------------------

fun main() {
    val book = Book("The Malt Shop Caper", 18)
    
    // The price just went up!
    book.price = 20
}
