package listing_05_08

enum class SchnauzerBreed {
    MINIATURE,
    STANDARD,
    GIANT
}

// ----------------------------------------------------------
// Listing 5.8 - Using an enum class with a `when` expression
// ----------------------------------------------------------

fun main() {
    fun describe(breed: SchnauzerBreed) = when (breed) {
        SchnauzerBreed.MINIATURE -> "Small"
        SchnauzerBreed.STANDARD  -> "Medium"
        SchnauzerBreed.GIANT     -> "Large"
    }
}
