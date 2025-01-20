package listing_12_19

interface FarmAnimal {
    val name: String
    fun speak()
}

class Chicken(override val name: String, var numberOfEggs: Int = 0) : FarmAnimal {
    override fun speak() = println("Cluck!")
}

// ----------------------------------------------------------------------------
// Listing 12.19 - Using an `if` conditional with `is` to perform a smart cast.
// ----------------------------------------------------------------------------

fun greet(animal: FarmAnimal) {
    println("Hello, ${animal.name}!")
    if (animal is Chicken) {
        println("I see you have ${animal.numberOfEggs} eggs today!")
    }
    animal.speak()
}
