package listing_18_22

// -----------------------------------------------------------------------------
// Listing 18.22 - Using a type parameter in multiple places throughout a class.
// -----------------------------------------------------------------------------

class Dish<T>(private var food: T) {
    fun replaceFood(newFood: T) {
        println("Replacing $food with $newFood")
        food = newFood
    }

    fun getFood(): T = food
}
