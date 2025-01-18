package listing_05_14

// -------------------------------------------------
// Listing 5.14 - Adding a function to an enum class
// -------------------------------------------------

enum class SchnauzerBreed(val height: Int) {
    MINIATURE(33),
    STANDARD(47),
    GIANT(65);

    val family: String = "Schnauzer"

    fun isShorterThan(centimeters: Int) = height < centimeters
}
