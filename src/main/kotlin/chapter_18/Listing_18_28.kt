package listing_18_28

interface Beverage {
    val idealTemperature: Int
}

class Mug<T : Beverage>(val beverage: T)

// ---------------------------------------------
// Listing 18.28 - Declaring a generic function.
// ---------------------------------------------

fun <T : Beverage> serve(beverage: T): Mug<T> = Mug(beverage)
