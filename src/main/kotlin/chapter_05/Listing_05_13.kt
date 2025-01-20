package listing_05_13

// --------------------------------------------------------------------------------------------
// Listing 5.13 - Adding a property to an enum class, without making it a constructor parameter
// --------------------------------------------------------------------------------------------

enum class SchnauzerBreed(val height: Int) {
    MINIATURE(33),
    STANDARD(47),
    GIANT(65);

    val family: String = "Schnauzer"
}
