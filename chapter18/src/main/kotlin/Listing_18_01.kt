package listing_18_01

// --------------------------------------------
// Listing 18.1 - Modeling the coffee and mugs.
// --------------------------------------------

enum class Coffee { LIGHT_ROAST, MEDIUM_ROAST, DARK_ROAST }
class Mug(val beverage: Coffee)

fun drink(coffee: Coffee) = println("Drinking coffee: $coffee")
