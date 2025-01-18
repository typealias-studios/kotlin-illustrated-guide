package listing_06_10

// ---------------------------------------------------------------------------------
// Listing 6.10 - Error: Type mismatch. Required Int / Found Int? (does not compile)
// ---------------------------------------------------------------------------------

fun main() {
    fun printReview(name: String, stars: Int) =
        println("$name gave it $stars stars!")
    
    val saraStars: Int? = 5
    
    // printReview("Sara", saraStars)
}
