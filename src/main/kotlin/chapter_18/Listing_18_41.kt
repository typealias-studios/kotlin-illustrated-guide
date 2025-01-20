package listing_18_41

sealed interface Beverage {
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

// -----------------------------------------------------------------------------
// Listing 18.41 - Error: Type Mismatch. Required: Mug<Coffee>. Found: Mug<Tea>.
// -----------------------------------------------------------------------------

fun main() {
    val mugOfCoffee: Mug<Coffee> = Mug(Coffee.DARK_ROAST)
    val mugOfTea: Mug<Tea> = Mug(Tea.RED_TEA)
    
    var mug: Mug<Coffee> = mugOfCoffee
    // mug = mugOfTea
}
