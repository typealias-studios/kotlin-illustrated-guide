package listing_12_11

interface FarmAnimal {
    val name: String
    fun speak()
}

// -----------------------------------------------------------------------
// Listing 12.11 - Error: Interface FarmAnimal does not have constructors.
// -----------------------------------------------------------------------

fun main() {
    // val donkey = FarmAnimal("Phyllis")
    // donkey.speak()
}
