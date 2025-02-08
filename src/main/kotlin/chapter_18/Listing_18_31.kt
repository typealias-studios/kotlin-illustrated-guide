package listing_18_31

interface Beverage {
    val idealTemperature: Int
}

enum class Coffee : Beverage {
    LIGHT_ROAST, MEDIUM_ROAST, DARK_ROAST;
    override val idealTemperature = 135
}

class Mug<T : Beverage>(val beverage: T)

// -----------------------------------------------------------------------------------------------------------------------
// Listing 18.31 - Declaring and calling a generic extension function, which uses the type parameter as the receiver type.
// -----------------------------------------------------------------------------------------------------------------------

fun <T : Beverage> T.pourIntoMug() = Mug(this)
val mug = Coffee.DARK_ROAST.pourIntoMug()
