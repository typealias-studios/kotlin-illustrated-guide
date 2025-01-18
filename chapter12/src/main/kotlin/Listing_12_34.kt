package listing_12_34

interface Speaker {
    fun speak() {
        println("...")
    }
}

interface Named {
    val name: String
}

interface FarmAnimal : Speaker, Named

class Snail(override val name: String) : FarmAnimal

// ----------------------------------------------------------------
// Listing 12.34 - Calling the default implementation of `speak()`.
// ----------------------------------------------------------------

fun main() {
    val snail = Snail("Slick")
    snail.speak() // prints "..."
}
