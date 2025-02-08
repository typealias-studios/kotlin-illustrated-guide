package listing_18_30

interface Beverage {
    val idealTemperature: Int
}

enum class Coffee : Beverage {
    LIGHT_ROAST, MEDIUM_ROAST, DARK_ROAST;
    override val idealTemperature = 135
}

class Mug<T : Beverage>(val beverage: T)

fun <T : Beverage> serve(beverage: T): Mug<T> = Mug(beverage)

// -------------------------------------------------------------------------------------------
// Listing 18.30 - Calling a generic function without explicitly specifying the type argument.
// -------------------------------------------------------------------------------------------

val mug = serve(Coffee.DARK_ROAST)
