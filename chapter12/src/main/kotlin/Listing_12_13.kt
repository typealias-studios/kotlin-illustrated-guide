package listing_12_13

interface FarmAnimal {
    val name: String
    fun speak()
}

// ---------------------------------------------------------------------------------------------------------------
// Listing 12.13 - Updating the `greet()` function to work with any implementations of the `FarmAnimal` interface.
// ---------------------------------------------------------------------------------------------------------------

class Farmer(val name: String) {
    fun greet(animal: FarmAnimal) {
        println("Good morning, ${animal.name}!")
        animal.speak()
    }
}
