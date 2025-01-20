package listing_05_05

enum class SchnauzerBreed {
    MINIATURE,
    STANDARD,
    GIANT
}

// -------------------------------------------------------------------------------------------------------------------------------------
// Listing 5.5 - Error: Cannot access '<init>': it is private in 'SchnauzerBreed' / Enum types cannot be instantiated (does not compile)
// -------------------------------------------------------------------------------------------------------------------------------------

fun main() {
    // val breed: SchnauzerBreed = SchnauzerBreed()
}
