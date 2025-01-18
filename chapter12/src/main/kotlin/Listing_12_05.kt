package listing_12_05

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

// ------------------------------------------------------------------------------------------
// Listing 12.5 - Adding a `greet(pig)` function - which is very similar to `greet(chicken)`.
// ------------------------------------------------------------------------------------------

class Farmer(val name: String) {
    fun greet(chicken: Chicken) {
        println("Good morning, ${chicken.name}!")
        chicken.speak()
    }

    fun greet(pig: Pig) {
        println("Good morning, ${pig.name}!")
        pig.speak()
    }
}
