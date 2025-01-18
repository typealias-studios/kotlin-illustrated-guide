package listing_18_05

enum class Coffee { LIGHT_ROAST, MEDIUM_ROAST, DARK_ROAST }
enum class Tea { GREEN_TEA, BLACK_TEA, RED_TEA }

fun drink(tea: Tea) = println("Drinking tea: $tea")

// -----------------------------------------------------------------------------------
// Listing 18.5 - Renaming `Mug` to `CoffeeMug`, and introducing a new `TeaMug` class.
// -----------------------------------------------------------------------------------

class CoffeeMug(val coffee: Coffee)
class TeaMug(val tea: Tea)
