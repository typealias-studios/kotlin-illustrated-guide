package listing_12_23

interface Speaker {
    fun speak()
}

interface Named {
    val name: String
}

// ------------------------------------------------------------
// Listing 12.23 - A class that implements multiple interfaces.
// ------------------------------------------------------------

class Cow(override val name: String) : Speaker, Named {
    override fun speak() = println("Moo!")
}
