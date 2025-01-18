package listing_18_27

interface Food
enum class Pastry : Food { MUFFIN, BAGEL }
enum class Soup : Food { TOMATO, CHICKEN_NOODLE }

// ----------------------------------------------------
// Listing 18.27 - Extending an abstract generic class.
// ----------------------------------------------------

abstract class Dish<T>(val food: T)
class BowlOfSoup(food: Soup) : Dish<Soup>(food)
class Bowl<F>(food: F) : Dish<F>(food)
