package listing_18_17

// ----------------------------------------------------------------------------
// Listing 18.17 - Adding an `idealTemperature` property to each beverage type.
// ----------------------------------------------------------------------------

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
