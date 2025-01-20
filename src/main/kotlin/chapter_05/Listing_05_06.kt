package listing_05_06

enum class SchnauzerBreed {
    MINIATURE,
    STANDARD,
    GIANT
}

// -------------------------------------------------------------
// Listing 5.6 - Assigning a variable to one of the enum options
// -------------------------------------------------------------

fun main() {
    val breed: SchnauzerBreed = SchnauzerBreed.GIANT
}
