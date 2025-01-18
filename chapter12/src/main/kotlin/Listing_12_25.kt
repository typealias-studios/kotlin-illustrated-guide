package listing_12_25

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

class Farmer(override val name: String) : Named {
    // (eliding the class body for now)
}

// ----------------------------------------------------------------------------------------------
// Listing 12.25 - Creating a list of `Named` objects, including both the farmer and the animals.
// ----------------------------------------------------------------------------------------------

fun main() {
    val roster: List<Named> = listOf(
        Farmer("Sue"),
        Chicken("Henrietta"),
        Pig("Hamlet", 1),
        Cow("Dairy Godmother")
    )
}
