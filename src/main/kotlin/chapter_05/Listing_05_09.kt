package listing_05_09

enum class SchnauzerBreed {
    MINIATURE,
    STANDARD,
    GIANT
}

// ----------------------------------------------------------------------------
// Listing 5.9 - Error: 'when' expression must be exhaustive (does not compile)
// ----------------------------------------------------------------------------

fun main() {
    // fun describe(breed: SchnauzerBreed) = when (breed) {
    //     SchnauzerBreed.MINIATURE -> "Small"
    //     SchnauzerBreed.STANDARD  -> "Medium"
    // }
}
