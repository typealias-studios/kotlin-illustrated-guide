package listing_05_16

enum class SchnauzerBreed(val height: Int) {
    MINIATURE(33),
    STANDARD(47),
    GIANT(65);

    val family: String = "Schnauzer"

    fun isShorterThan(centimeters: Int) = height < centimeters
}

// -----------------------------------------------------------------------------------------------
// Listing 5.16 - Using the `name` property that Kotlin automatically includes in all enum classes
// -----------------------------------------------------------------------------------------------

fun describe(breed: SchnauzerBreed) {
    println(breed.name)
    println(breed.height)
}
