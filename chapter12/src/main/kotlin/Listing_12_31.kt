package listing_12_31

interface Speaker {
    fun speak()
}

interface Named {
    val name: String
}

interface FarmAnimal : Speaker, Named

class Cow(override val name: String) : FarmAnimal {
    override fun speak() = println("Moo!")
}

// ------------------------------------------------------------------------------------------------------------------
// Listing 12.31 - A `Cow` object can be used wherever a `Cow`, `FarmAnimal`, `Named`, or `Speaker` type is accepted.
// ------------------------------------------------------------------------------------------------------------------

fun milk(cow: Cow) { /* ... */ }
fun feed(animal: FarmAnimal) { /* ... */ }
fun introduce(name: Named) { /* ... */ }
fun listenTo(speaker: Speaker) { /* ... */ }
