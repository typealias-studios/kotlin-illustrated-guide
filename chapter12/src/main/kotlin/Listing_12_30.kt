package listing_12_30

interface Speaker {
    fun speak()
}

interface Named {
    val name: String
}

interface FarmAnimal : Speaker, Named

// ---------------------------------------------------------------------------
// Listing 12.30 - Declaring that `Cow` implements `FarmAnimal`. It's implied
// that it also implements `Named` and `Speaker`, because `FarmAnimal` extends
// those two interfaces.
// ---------------------------------------------------------------------------

class Cow(override val name: String) : FarmAnimal {
    override fun speak() = println("Moo!")
}

