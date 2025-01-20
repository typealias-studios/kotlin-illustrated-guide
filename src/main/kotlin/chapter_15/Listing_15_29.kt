package listing_15_29

data class Book(
    val title: String,
    val price: Int,
    val author: String,
    val width: Int,
    val height: Int,
    val isbn: String,
)

val book = Book("The Malt Shop Caper", 18, "Slim Chancery", 6, 9, "020516918K")

// -------------------------------------------
// Listing 15.29 - A destructuring assignment.
// -------------------------------------------

fun main() {
    val (title, cost, author, widthInInches, heightInInches, isbn) = book
}
