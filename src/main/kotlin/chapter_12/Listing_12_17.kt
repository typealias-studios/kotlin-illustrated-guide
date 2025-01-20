package listing_12_17

interface FarmAnimal {
    val name: String
    fun speak()
}

class Chicken(override val name: String, var numberOfEggs: Int = 0) : FarmAnimal {
    override fun speak() = println("Cluck!")
}

// ---------------------------------------------------------
// Listing 12.17 - Error: Unresolved reference: numberOfEggs
// ---------------------------------------------------------

fun main() {
    val henrietta: FarmAnimal = Chicken("Henrietta")
    // henrietta.numberOfEggs = 1
}
