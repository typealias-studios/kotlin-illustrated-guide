package listing_16_21

// ------------------------------------------------------------
// Listing 16.21 - Combines the code from Listings 5.4 and 5.8.
// ------------------------------------------------------------

enum class SchnauzerBreed { MINIATURE, STANDARD, GIANT }

fun describe(breed: SchnauzerBreed) = when (breed) {
    SchnauzerBreed.MINIATURE -> "Small"
    SchnauzerBreed.STANDARD  -> "Medium"
    SchnauzerBreed.GIANT     -> "Large"
}
