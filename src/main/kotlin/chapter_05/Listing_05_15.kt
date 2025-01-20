package listing_05_15

enum class SchnauzerBreed(val height: Int) {
    MINIATURE(33),
    STANDARD(47),
    GIANT(65);

    val family: String = "Schnauzer"

    fun isShorterThan(centimeters: Int) = height < centimeters
}

// ---------------------------------------------------------------
// Listing 5.15 - Using a property and function from an enum class
// ---------------------------------------------------------------

fun main() {
    println(SchnauzerBreed.STANDARD.family)             // Prints "Schnauzer"
    println(SchnauzerBreed.STANDARD.isShorterThan(40))  // Prints "false"
}
