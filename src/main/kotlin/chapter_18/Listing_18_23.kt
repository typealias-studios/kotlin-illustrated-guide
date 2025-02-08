package listing_18_23

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

interface Food
enum class Pastry : Food { MUFFIN, BAGEL }

class Mug<T : Beverage>(val beverage: T)

// -------------------------------------------------
// Listing 18.23 - A class with two type parameters.
// -------------------------------------------------

class ComboOrder<T : Food, U : Beverage>(val food: T, val beverage: U)
val combo: ComboOrder<Pastry, Tea> = ComboOrder(Pastry.MUFFIN, Tea.GREEN_TEA)
