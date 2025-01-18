package listing_06_04

class CoffeeReview(
    val name: String,
    val comment: String,
    val stars: Int
)

val saraReview = CoffeeReview("Sara", "Loved the coffee!", 5)
val tobyReview = CoffeeReview("Toby", "Pretty good!", 4)
val lucyReview = CoffeeReview("Lucy", "Will buy this again!", 0)

// -------------------------------------------------------
// Listing 6.4 - Printing the coffee reviews to the screen
// -------------------------------------------------------

fun main() {
    fun printReview(review: CoffeeReview) =
        println("${review.name} gave it ${review.stars} stars!")
    
    println("Latest coffee reviews")
    println("---------------------")
    printReview(saraReview)
    printReview(tobyReview)
    printReview(lucyReview)
}
