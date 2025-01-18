package listing_12_28

interface Speaker {
    fun speak()
}

interface Named {
    val name: String
}

interface FarmAnimal {
    val name: String
    fun speak()
}

// -----------------------------------------------------------
// Listing 12.28 - Implementing three interfaces in one class.
// -----------------------------------------------------------

class Cow(override val name: String) : Speaker, Named, FarmAnimal {
    override fun speak() = println("Moo!")
}
