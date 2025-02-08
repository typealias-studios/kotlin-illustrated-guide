package listing_18_29

interface Beverage {
    val idealTemperature: Int
}

enum class Coffee : Beverage {
    LIGHT_ROAST, MEDIUM_ROAST, DARK_ROAST;
    override val idealTemperature = 135
}

class Mug<T : Beverage>(val beverage: T)

fun <T : Beverage> serve(beverage: T): Mug<T> = Mug(beverage)

// -------------------------------------------
// Listing 18.29 - Calling a generic function.
// -------------------------------------------

val mug = serve<Coffee>(Coffee.DARK_ROAST)
