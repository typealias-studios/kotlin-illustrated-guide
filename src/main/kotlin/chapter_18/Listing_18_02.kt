package listing_18_02

enum class Coffee { LIGHT_ROAST, MEDIUM_ROAST, DARK_ROAST }
class Mug(val beverage: Coffee)

fun drink(coffee: Coffee) = println("Drinking coffee: $coffee")

// -------------------------------------------------------------------
// Listing 18.2 - Instantiating a `Mug` with the right kind of coffee.
// -------------------------------------------------------------------

val mug = Mug(Coffee.LIGHT_ROAST)
