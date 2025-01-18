package listing_12_14

interface FarmAnimal {
    val name: String
    fun speak()
}

class Chicken(override val name: String, var numberOfEggs: Int = 0) : FarmAnimal {
    override fun speak() = println("Cluck!")
}

// --------------------------------------------------
// Listing 12.14 - Explicitly specifying a supertype.
// --------------------------------------------------

fun main() {
    val henrietta: FarmAnimal = Chicken("Henrietta")
}
