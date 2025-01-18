package listing_05_12

enum class SchnauzerBreed(val height: Int) {
    MINIATURE(33),
    STANDARD(47),
    GIANT(65)
}

// --------------------------------------------------
// Listing 5.12 - Getting a property of an enum class
// --------------------------------------------------

fun main() {
    println(SchnauzerBreed.MINIATURE.height)
}
