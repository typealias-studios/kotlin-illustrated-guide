package listing_18_42

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

// ----------------------------------------------------------------------------------
// Listing 18.42 - Error: Type Mismatch. Required: Mug<Beverage>. Found: Mug<Coffee>.
// ----------------------------------------------------------------------------------

fun main() {
    val mugOfCoffee: Mug<Coffee> = Mug(Coffee.DARK_ROAST)
    val mugOfTea: Mug<Tea> = Mug(Tea.RED_TEA)
    
    // var mug: Mug<Beverage> = mugOfCoffee
}
