package listing_13_19

interface Eater {
    fun eat()
}

class Muncher(private val food: String) : Eater {
    override fun eat() = println("Eating $food - munch, munch, munch!")
}

// ---------------------------------------------------------------------------------------
// Listing 13.19 - Using delegation so that all animals can use the same `eat()` function.
// ---------------------------------------------------------------------------------------

fun main() {
    class Cow : Eater by Muncher("grass")
    class Chicken : Eater by Muncher("bugs")
    class Pig : Eater by Muncher("corn")
    
    Cow().eat()     // Eating grass - munch, munch, munch!
    Chicken().eat() // Eating bugs - munch, munch, munch!
    Pig().eat()     // Eating corn - munch, munch, munch!
}
