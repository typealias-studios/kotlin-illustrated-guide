package listing_18_43

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

class Mug<T : Beverage>(val beverage: T)

// ----------------------------------------------------------------------------------------------------------
// Listing 18.43 - Listing 18.42 compiles just fine when directly assigning the result of a constructor call.
// ----------------------------------------------------------------------------------------------------------

val mug: Mug<Beverage> = Mug(Coffee.DARK_ROAST)
