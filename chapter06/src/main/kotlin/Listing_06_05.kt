package listing_06_05

class CoffeeReview(
    val name: String,
    val comment: String,
    val stars: Int
)

// ------------------------------------------------------------------------------------
// Listing 6.5 - Error: Null can not be a value of non-null type Int (does not compile)
// ------------------------------------------------------------------------------------

// val lucyReview = CoffeeReview("Lucy", "Will buy this again!", null)
