package listing_18_38

sealed interface Beverage {
    val idealTemperature: Int
}

enum class Coffee : Beverage {
    LIGHT_ROAST, MEDIUM_ROAST, DARK_ROAST;
    override val idealTemperature = 135
}

// -------------------------------------------------------------------
// Listing 18.38 - The non-generic version of `Mug` from Listing 18.6.
// -------------------------------------------------------------------

class Mug(val beverage: Beverage)
