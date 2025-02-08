package listing_18_20

interface Beverage {
    val idealTemperature: Int
}

enum class Tea : Beverage {
    GREEN_TEA, BLACK_TEA, RED_TEA;
    override val idealTemperature = 140
}

enum class Coffee : Beverage {
    LIGHT_ROAST, MEDIUM_ROAST, DARK_ROAST;
    override val idealTemperature = 135
}

class Mug<T : Beverage>(val beverage: T)

// --------------------------------------------------------------
// Listing 18.20 - Error: Type argument is not within its bounds.
// --------------------------------------------------------------

fun main() {
    // val mugOfString: Mug<String> = Mug("This won't work any more!")
}
