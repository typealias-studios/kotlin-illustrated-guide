package listing_12_07

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

// --------------------------------------------------------------------------------------------------
// Listing 12.7 - Error: None of the following functions can be called with the arguments supplied...
// --------------------------------------------------------------------------------------------------

fun main() {
    val sue = Farmer("Sue")
    val henrietta = Chicken("Henrietta")
    val hamlet = Pig("Hamlet", 1)
    val dairyGodmother = Cow("Dairy Godmother")
    
    sue.greet(henrietta)
    sue.greet(hamlet)
    // sue.greet(dairyGodmother)
}
