package listing_12_26

interface Speaker {
    fun speak()
}

interface Named {
    val name: String
}

class Cow(override val name: String) : Speaker, Named {
    override fun speak() = println("Moo!")
}

class Chicken(override val name: String, var numberOfEggs: Int = 0) : Speaker, Named {
    override fun speak() = println("Cluck!")
}

class Pig(override val name: String, val excitementLevel: Int) : Speaker, Named {
    override fun speak() {
        repeat(excitementLevel) {
            println("Oink!")
        }
    }
}

// -------------------------------------------------------
// Listing 12.26 - Error: Unresolved reference: FarmAnimal
// -------------------------------------------------------

class Farmer(override val name: String) : Named {
    // fun greet(animal: FarmAnimal) {
    //     println("Good morning, ${animal.name}!")
    //     animal.speak()
    // }
}
