package listing_12_04

class Chicken(val name: String, var numberOfEggs: Int = 0) {
    fun speak() = println("Cluck!")
}

class Farmer(val name: String) {
    fun greet(chicken: Chicken) {
        println("Good morning, ${chicken.name}!")
        chicken.speak()
    }
}

class Pig(val name: String, val excitementLevel: Int) {
    fun speak() {
        repeat(excitementLevel) {
            println("Oink!")
        }
    }
}

// -----------------------------------------------------------------
// Listing 12.4 - Error: Type mismatch: Required Chicken. Found Pig.
// -----------------------------------------------------------------

fun main() {
    val sue = Farmer("Sue")
    val henrietta = Chicken("Henrietta")
    val hamlet = Pig("Hamlet", 1)
    
    sue.greet(henrietta)
    // sue.greet(hamlet)
}
