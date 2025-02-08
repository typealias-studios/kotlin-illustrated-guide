package listing_18_15

interface Beverage
enum class Tea : Beverage { GREEN_TEA, BLACK_TEA, RED_TEA }
enum class Coffee : Beverage { LIGHT_ROAST, MEDIUM_ROAST, DARK_ROAST }

fun drink(coffee: Coffee) = println("Drinking coffee: $coffee")
fun drink(tea: Tea) = println("Drinking tea: $tea")

class Mug<T>(val beverage: T)

// ---------------------------------------------------------------------
// Listing 18.15 - Explicitly specifying the type of the `mug` variable.
// ---------------------------------------------------------------------

fun main() {
    val mug: Mug<Coffee> = Mug(Coffee.LIGHT_ROAST)
}
