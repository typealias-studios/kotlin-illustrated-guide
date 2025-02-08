package listing_18_12

interface Beverage
enum class Tea : Beverage { GREEN_TEA, BLACK_TEA, RED_TEA }
enum class Coffee : Beverage { LIGHT_ROAST, MEDIUM_ROAST, DARK_ROAST }

fun drink(coffee: Coffee) = println("Drinking coffee: $coffee")
fun drink(tea: Tea) = println("Drinking tea: $tea")

class Mug(val beverage: Beverage)

// ----------------------------------------------------------------------------
// Listing 18.12 - Casting the `Beverage` to `Coffee` before calling `drink()`.
// ----------------------------------------------------------------------------

fun main() {
    val mugOfCoffee = Mug(Coffee.LIGHT_ROAST)
    drink(mugOfCoffee.beverage as Coffee)
}
