package listing_18_10

interface Beverage
enum class Tea : Beverage { GREEN_TEA, BLACK_TEA, RED_TEA }
enum class Coffee : Beverage { LIGHT_ROAST, MEDIUM_ROAST, DARK_ROAST }

// ------------------------------------------------------------------------
// Listing 18.10 - Error: Type mismatch. Required: Coffee. Found: Beverage.
// ------------------------------------------------------------------------

fun main() {
    val beverage: Beverage = Coffee.MEDIUM_ROAST
    // val coffee: Coffee = beverage
}
