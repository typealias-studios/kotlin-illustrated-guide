package listing_18_03

enum class Coffee { LIGHT_ROAST, MEDIUM_ROAST, DARK_ROAST }
class Mug(val beverage: Coffee)

fun drink(coffee: Coffee) = println("Drinking coffee: $coffee")

val mug = Mug(Coffee.LIGHT_ROAST)

// ----------------------------------------------------------------------------------
// Listing 18.3 - Calling the `drink()` function with the beverage that's in the mug.
// ----------------------------------------------------------------------------------

fun main() {
    drink(mug.beverage) // Drinking coffee: LIGHT_ROAST
}
