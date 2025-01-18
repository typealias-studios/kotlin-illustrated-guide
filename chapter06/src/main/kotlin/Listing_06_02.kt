package listing_06_02

class CoffeeReview(
    val name: String,
    val comment: String,
    val stars: Int
)

// --------------------------------------------------------
// Listing 6.2 - Instantiating a few `CoffeeReview` objects
// --------------------------------------------------------

val saraReview = CoffeeReview("Sara", "Loved the coffee!", 5)
val tobyReview = CoffeeReview("Toby", "Pretty good!", 4)
