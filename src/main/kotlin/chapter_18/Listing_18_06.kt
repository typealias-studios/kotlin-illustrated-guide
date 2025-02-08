package listing_18_06

// ---------------------------------------------------------------
// Listing 18.6 - Creating a sealed interface for a beverage type.
// ---------------------------------------------------------------

interface Beverage
enum class Tea : Beverage { GREEN_TEA, BLACK_TEA, RED_TEA }
enum class Coffee : Beverage { LIGHT_ROAST, MEDIUM_ROAST, DARK_ROAST }

class Mug(val beverage: Beverage)
