package listing_12_16

interface FarmAnimal {
    val name: String
    fun speak()
}

class Chicken(override val name: String, var numberOfEggs: Int = 0) : FarmAnimal {
    override fun speak() = println("Cluck!")
}

// ---------------------------------------------------------------------------
// Listing 12.16 - Explicitly specifying the subtype instead of the supertype.
// ---------------------------------------------------------------------------

fun main() {
    val henrietta: Chicken = Chicken("Henrietta")
    henrietta.numberOfEggs = 1
}
