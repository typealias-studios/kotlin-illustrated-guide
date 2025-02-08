package listing_18_21

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

// ------------------------------------------------------------------------
// Listing 18.21 - The code from Listing 18.18 now compiles without errors.
// ------------------------------------------------------------------------

class Mug<T : Beverage>(val beverage: T) {
    val temperature = beverage.idealTemperature
}
