package listing_12_12

interface FarmAnimal {
    val name: String
    fun speak()
}

// ------------------------------------------------------------------------------------------
// Listing 12.12 - Updating the `Cow` class so that it implements the `FarmAnimal` interface.
// ------------------------------------------------------------------------------------------

class Cow(override val name: String) : FarmAnimal {
    override fun speak() = println("Moo!")
}
