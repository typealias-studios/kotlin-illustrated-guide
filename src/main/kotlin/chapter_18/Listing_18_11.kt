package listing_18_11

interface Beverage
enum class Tea : Beverage { GREEN_TEA, BLACK_TEA, RED_TEA }
enum class Coffee : Beverage { LIGHT_ROAST, MEDIUM_ROAST, DARK_ROAST }

// -------------------------------------------------------------------------------------------------
// Listing 18.11 - Error: None of the following functions can be called with the arguments supplied.
// -------------------------------------------------------------------------------------------------

fun main() {
    fun drink(coffee: Coffee) = println("Drinking coffee: $coffee")
    fun drink(tea: Tea) = println("Drinking tea: $tea")
    
    class Mug(val beverage: Beverage)
    
    val mugOfCoffee = Mug(Coffee.LIGHT_ROAST)
    // drink(mugOfCoffee.beverage)
}
