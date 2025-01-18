package listing_12_21

interface FarmAnimal {
    val name: String
    fun speak()
}

class Chicken(override val name: String, var numberOfEggs: Int = 0) : FarmAnimal {
    override fun speak() = println("Cluck!")
}

// --------------------------------------
// Listing 12.21 - An explicit safe cast.
// --------------------------------------

fun greet(animal: FarmAnimal) {
    println("Hello, ${animal.name}!")

    val chicken: Chicken? = animal as? Chicken
    chicken?.let { println("I see you have ${it.numberOfEggs} eggs today!") }

    animal.speak()
}
