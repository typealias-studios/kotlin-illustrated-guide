package listing_18_39

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

class Mug(val beverage: Beverage)

// -------------------------------------------------------------------------------------------------------------------------
// Listing 18.39 - A variable with the `Mug` type from Listing 18.38 can be assigned either a mug of coffee or a mug of tea.
// -------------------------------------------------------------------------------------------------------------------------

fun main() {
    val mugOfCoffee: Mug = Mug(Coffee.DARK_ROAST)
    val mugOfTea: Mug = Mug(Tea.RED_TEA)
    
    var mug: Mug = mugOfCoffee
    mug = mugOfTea
}
