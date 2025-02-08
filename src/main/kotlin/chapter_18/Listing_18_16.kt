package listing_18_16

interface Beverage
enum class Tea : Beverage { GREEN_TEA, BLACK_TEA, RED_TEA }
enum class Coffee : Beverage { LIGHT_ROAST, MEDIUM_ROAST, DARK_ROAST }
class Mug<T>(val beverage: T)

fun drink(coffee: Coffee) = println("Drinking coffee: $coffee")
fun drink(tea: Tea) = println("Drinking tea: $tea")

// -----------------------------------------------------------------------------------------
// Listing 18.16 - The type of `mug.beverage` here is `Tea`, so there is no need to cast it.
// -----------------------------------------------------------------------------------------

fun main() {
    val mug: Mug<Tea> = Mug(Tea.GREEN_TEA)
    drink(mug.beverage)
}
