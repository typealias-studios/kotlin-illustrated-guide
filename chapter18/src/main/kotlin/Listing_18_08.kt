package listing_18_08

sealed interface Beverage
enum class Tea : Beverage { GREEN_TEA, BLACK_TEA, RED_TEA }
enum class Coffee : Beverage { LIGHT_ROAST, MEDIUM_ROAST, DARK_ROAST }

class Mug(val beverage: Beverage)
val mugOfCoffee = Mug(Coffee.LIGHT_ROAST)
val mugOfTea = Mug(Tea.BLACK_TEA)

// ----------------------------------------------------------------------------------------
// Listing 18.8 - Error: None of the functions can be called with the arguments supplied...
// ----------------------------------------------------------------------------------------

fun main() {
    fun drink(coffee: Coffee) = println("Drinking coffee: $coffee")
    fun drink(tea: Tea) = println("Drinking tea: $tea")
    
    // drink(mugOfCoffee.beverage)
    // drink(mugOfTea.beverage)
}
