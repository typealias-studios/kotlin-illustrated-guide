package listing_18_45

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

// ----------------------------------------------------------------------------------
// Listing 18.45 - Checking the type of the beverage rather than the type of the mug.
// ----------------------------------------------------------------------------------

fun main() {
    val mug: Mug<Beverage> = Mug(Coffee.MEDIUM_ROAST)
    
    when (mug.beverage) {
        is Tea    -> println("Sipping on tea: ${mug.beverage}!")
        is Coffee -> println("Sipping on coffee: ${mug.beverage}!")
    }
}
