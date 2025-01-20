package listing_18_07

sealed interface Beverage
enum class Tea : Beverage { GREEN_TEA, BLACK_TEA, RED_TEA }
enum class Coffee : Beverage { LIGHT_ROAST, MEDIUM_ROAST, DARK_ROAST }

class Mug(val beverage: Beverage)

// --------------------------------------------------------------
// Listing 18.7 - Instantiating a mug of coffee and a mug of tea.
// --------------------------------------------------------------

val mugOfCoffee = Mug(Coffee.LIGHT_ROAST)
val mugOfTea = Mug(Tea.BLACK_TEA)
