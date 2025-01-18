package listing_18_44

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

// -------------------------------------------------------------------------
// Listing 18.44 - Error: Cannot check for instance of erased type: Mug<Tea>
// -------------------------------------------------------------------------

fun main() {
    val mug: Mug<Beverage> = Mug(Coffee.MEDIUM_ROAST)
    
    // when (mug) {
    //     is Mug<Tea>    -> println("Sipping on tea: ${mug.beverage}!")
    //     is Mug<Coffee> -> println("Sipping on coffee: ${mug.beverage}!")
    // }
}
