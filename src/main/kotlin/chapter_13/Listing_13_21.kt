package listing_13_21

interface Eater {
    fun eat()
}

class Muncher(private val food: String) : Eater {
    override fun eat() = println("Eating $food - munch, munch, munch!")
}

// --------------------------------------------------------------------------------------------
// Listing 13.21 - Creating a second implementation of `Eater` that is used by the `Pig` class.
// --------------------------------------------------------------------------------------------

class Scarfer(private val food: String) : Eater {
    override fun eat() = println("Scarfing down $food - NOM NOM NOM!!!")
}

class Cow : Eater by Muncher("grass")
class Chicken : Eater by Muncher("bugs")
class Pig : Eater by Scarfer("corn")
