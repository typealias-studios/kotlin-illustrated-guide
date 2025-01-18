package listing_12_08

class Chicken(val name: String, var numberOfEggs: Int = 0) {
    fun speak() = println("Cluck!")
}

class Pig(val name: String, val excitementLevel: Int) {
    fun speak() {
        repeat(excitementLevel) {
            println("Oink!")
        }
    }
}

class Cow(val name: String) {
    fun speak() = println("Moo!")
}

// ----------------------------------------------------------------------------------
// Listing 12.8 - Adding a third `greet()` function. This one accepts a `Cow` object.
// ----------------------------------------------------------------------------------

class Farmer(val name: String) {
    fun greet(chicken: Chicken) {
        println("Good morning, ${chicken.name}!")
        chicken.speak()
    }

    fun greet(pig: Pig) {
        println("Good morning, ${pig.name}!")
        pig.speak()
    }

    fun greet(cow: Cow) {
        println("Good morning, ${cow.name}!")
        cow.speak()
    }
}
