package listing_15_26

data class Book(
    val title: String,
    val price: Int,
    val author: String,
    val width: Int,
    val height: Int,
    val isbn: String,
)

val book = Book("The Malt Shop Caper", 18, "Slim Chancery", 6, 9, "020516918K")

// -----------------------------------------------------------------------------
// Listing 15.26 - Using the `copy()` function that is included in data classes.
// -----------------------------------------------------------------------------

val newBook = book.copy(price = 20)
