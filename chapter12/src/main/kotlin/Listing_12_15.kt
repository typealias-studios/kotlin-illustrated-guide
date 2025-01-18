package listing_12_15

interface FarmAnimal {
    val name: String
    fun speak()
}

class Farmer(val name: String) {
    fun greet(animal: FarmAnimal) {
        println("Good morning, ${animal.name}!")
        animal.speak()
    }
}

class Chicken(override val name: String, var numberOfEggs: Int = 0) : FarmAnimal {
    override fun speak() = println("Cluck!")
}

class Pig(override val name: String, val excitementLevel: Int) : FarmAnimal {
    override fun speak() {
        repeat(excitementLevel) {
            println("Oink!")
        }
    }
}

class Cow(override val name: String) : FarmAnimal {
    override fun speak() = println("Moo!")
}

// ---------------------------------------------------------------------------------------------------------
// Listing 12.15 - Using `FarmAnimal` in a `List` to put multiple implementations into a single collection. 
// ---------------------------------------------------------------------------------------------------------

fun main() {
    val sue = Farmer("Sue")

    val animals: List<FarmAnimal> = listOf(
        Chicken("Henrietta"),
        Pig("Hamlet", 1),
        Cow("Dairy Godmother"),
    )

    animals.forEach { sue.greet(it) }
}
