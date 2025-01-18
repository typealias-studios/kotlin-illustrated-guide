package listing_12_33

interface Speaker {
    fun speak() {
        println("...")
    }
}

interface Named {
    val name: String
}

interface FarmAnimal : Speaker, Named

// ----------------------------------------------------------------------------------------
// Listing 12.33 - A class that uses the default implementation for the `speak()` function.
// ----------------------------------------------------------------------------------------

class Snail(override val name: String) : FarmAnimal
