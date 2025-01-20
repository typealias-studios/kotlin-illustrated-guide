package listing_06_03

class CoffeeReview(
    val name: String,
    val comment: String,
    val stars: Int
)

// -----------------------------------------------------------------------------------------------------
// Listing 6.3 - Using a star rating of `0` because Lucy forgot to mark a star rating on the review card
// -----------------------------------------------------------------------------------------------------

val lucyReview = CoffeeReview("Lucy", "Will buy this again!", 0)
