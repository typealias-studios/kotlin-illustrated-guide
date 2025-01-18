package listing_12_01

// -----------------------------------------------------------
// Listing 12.1 - Classes to represent a chicken and a farmer.
// -----------------------------------------------------------

class Chicken(val name: String, var numberOfEggs: Int = 0) {
    fun speak() = println("Cluck!")
}

class Farmer(val name: String) {
    fun greet(chicken: Chicken) {
        println("Good morning, ${chicken.name}!")
        chicken.speak()
    }
}
