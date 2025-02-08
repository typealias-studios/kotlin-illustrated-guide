package listing_18_40

interface Beverage {
    val idealTemperature: Int
}

enum class Coffee : Beverage {
    LIGHT_ROAST, MEDIUM_ROAST, DARK_ROAST;
    override val idealTemperature = 135
}

enum class Tea : Beverage {
    GREEN_TEA, BLACK_TEA, RED_TEA;
    override val idealTemperature = 140
}

// -----------------------------------------------------
// Listing 18.40 - A generic version of the `Mug` class.
// -----------------------------------------------------

class Mug<T : Beverage>(val beverage: T)
