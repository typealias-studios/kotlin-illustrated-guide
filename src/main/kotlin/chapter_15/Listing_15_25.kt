package listing_15_25

// -----------------------------------------------------------------------
// Listing 15.25 - Manually copying an object that has lots of properties.
// -----------------------------------------------------------------------

data class Book(
    val title: String,
    val price: Int,
    val author: String,
    val width: Int,
    val height: Int,
    val isbn: String,
)

val book = Book("The Malt Shop Caper", 18, "Slim Chancery", 6, 9, "020516918K")

// The price just went up!
val newBook = Book(book.title, 20, book.author, book.height, book.width, book.isbn)
