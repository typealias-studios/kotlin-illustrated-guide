package listing_12_37

interface Speaker {
    fun speak() {
        println("...")
    }
}

interface Named {
    val name: String get() = "No name"
}

interface FarmAnimal : Speaker, Named

// ---------------------------------------------------------------------------------------------------------------------
// Listing 12.37 - A class that implements `FarmAnimal`, using the default implementation for both `name` and `speak()`.
// ---------------------------------------------------------------------------------------------------------------------

class UnknownAnimal : FarmAnimal

val unknown = UnknownAnimal()
