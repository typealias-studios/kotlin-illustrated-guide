package listing_18_09

interface Beverage
enum class Tea : Beverage { GREEN_TEA, BLACK_TEA, RED_TEA }
enum class Coffee : Beverage { LIGHT_ROAST, MEDIUM_ROAST, DARK_ROAST }

// --------------------------------------------------------------------------------------
// Listing 18.9 - Assigning `Coffee.MEDIUM_ROAST` to variables that have different types.
// --------------------------------------------------------------------------------------

val coffee:   Coffee   = Coffee.MEDIUM_ROAST
val beverage: Beverage = Coffee.MEDIUM_ROAST
val anything: Any      = Coffee.MEDIUM_ROAST
