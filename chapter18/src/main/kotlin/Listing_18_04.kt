package listing_18_04

// ----------------------------------------------------------------------------------------------
// Listing 18.4 - A new enum class representing tea, plus an overload of the `drink()` function. 
// ----------------------------------------------------------------------------------------------

enum class Tea { GREEN_TEA, BLACK_TEA, RED_TEA }
fun drink(tea: Tea) = println("Drinking tea: $tea")
