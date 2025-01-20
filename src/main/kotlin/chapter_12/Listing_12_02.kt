package listing_12_02

class Chicken(val name: String, var numberOfEggs: Int = 0) {
    fun speak() = println("Cluck!")
}

class Farmer(val name: String) {
    fun greet(chicken: Chicken) {
        println("Good morning, ${chicken.name}!")
        chicken.speak()
    }
}

// -------------------------------------------------------------------------
// Listing 12.2 - Instantiating classes, and calling the `greet()` function.
// -------------------------------------------------------------------------

fun main() {
    val sue = Farmer("Sue")
    val henrietta = Chicken("Henrietta")
    
    sue.greet(henrietta)
}
