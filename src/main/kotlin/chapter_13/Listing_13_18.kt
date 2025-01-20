package listing_13_18

interface Eater {
    fun eat()
}

// -------------------------------------------------------------------------------------
// Listing 13.18 - A class that implements the Eater interface, making a munching sound.
// -------------------------------------------------------------------------------------

class Muncher(private val food: String) : Eater {
    override fun eat() = println("Eating $food - munch, munch, munch!")
}
