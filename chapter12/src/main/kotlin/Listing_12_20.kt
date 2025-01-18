package listing_12_20

interface FarmAnimal {
    val name: String
    fun speak()
}

class Chicken(override val name: String, var numberOfEggs: Int = 0) : FarmAnimal {
    override fun speak() = println("Cluck!")
}

// --------------------------------------------------------------------------
// Listing 12.20 - Explicitly casting to a Chicken. This is an 'unsafe cast'.
// --------------------------------------------------------------------------

fun greet(animal: FarmAnimal) {
    println("Hello, ${animal.name}!")

    val chicken: Chicken = animal as Chicken
    println("I see you have ${chicken.numberOfEggs} eggs today!")

    animal.speak()
}
