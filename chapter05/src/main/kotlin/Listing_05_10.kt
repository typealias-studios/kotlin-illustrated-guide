package listing_05_10

enum class SchnauzerBreed {
    MINIATURE,
    STANDARD,
    GIANT
}

// -----------------------------------------------------------------------------------------------------------------------
// Listing 5.10 - Providing an `else` branch, because not all of the enum entries are represented in the `when` expression
// -----------------------------------------------------------------------------------------------------------------------

fun main() {
    fun describe(breed: SchnauzerBreed) = when (breed) {
        SchnauzerBreed.MINIATURE -> "Small"
        SchnauzerBreed.STANDARD  -> "Medium"
        else                     -> "Unknown"            
    }
}
