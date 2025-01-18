package listing_05_11

// ---------------------------------------------------------------
// Listing 5.11 - Adding a constructor parameter to an enum class.
// ---------------------------------------------------------------

enum class SchnauzerBreed(val height: Int) {
    MINIATURE(33),
    STANDARD(47),
    GIANT(65)
}
