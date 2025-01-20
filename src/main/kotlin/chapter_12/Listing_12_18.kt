package listing_12_18

interface FarmAnimal {
    val name: String
    fun speak()
}

class Chicken(override val name: String, var numberOfEggs: Int = 0) : FarmAnimal {
    override fun speak() = println("Cluck!")
}

// ---------------------------------------------------------
// Listing 12.18 - Error: Unresolved reference: numberOfEggs
// ---------------------------------------------------------

val chicken: Chicken = Chicken("Henrietta")

class Farmer(val name: String) {
    fun greet(animal: FarmAnimal) {
        println("Hello, ${animal.name}!")
        // println("I see you have ${animal.numberOfEggs} eggs today!")
        animal.speak()
    }
}
