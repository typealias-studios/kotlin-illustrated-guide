package listing_15_28

data class Book(
    val title: String,
    val price: Int,
    val author: String,
    val width: Int,
    val height: Int,
    val isbn: String,
)

val book = Book("The Malt Shop Caper", 18, "Slim Chancery", 6, 9, "020516918K")

// -------------------------------------------------------------------------
// Listing 15.28 - Manually destructuring an object into multiple variables.
// -------------------------------------------------------------------------

fun main() {
    val title = book.title
    val cost = book.price
    val author = book.author
    val widthInInches = book.width
    val heightInInches = book.height
    val isbn = book.isbn
}
