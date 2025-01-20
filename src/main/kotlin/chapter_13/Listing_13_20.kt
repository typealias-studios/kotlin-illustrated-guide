package listing_13_20

interface Eater {
    fun eat()
}

class Muncher(private val food: String) : Eater {
    override fun eat() = println("Eating $food - munch, munch, munch!")
}

// ------------------------------------------------------------------------------
// Listing 13.20 - Implementing the `eat()` function directly in the `Pig` class.
// ------------------------------------------------------------------------------

fun main() {
    class Cow : Eater by Muncher("grass")
    class Chicken : Eater by Muncher("bugs")
    class Pig : Eater {
        override fun eat() = println("Scarfing down corn - NOM NOM NOM!!!")
    } 
    
    Cow().eat()     // Eating grass - munch, munch, munch!
    Chicken().eat() // Eating bugs - munch, munch, munch!
    Pig().eat()     // Scarfing down corn - NOM NOM NOM!!!
}
