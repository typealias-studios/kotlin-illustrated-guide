package listing_18_26

interface Dish<T> { val food: T }
interface Food
enum class Pastry : Food { MUFFIN, BAGEL }
enum class Soup : Food { TOMATO, CHICKEN_NOODLE }

// -----------------------------------------------------------
// Listing 18.26 - Relaying a type parameter to the supertype.
// -----------------------------------------------------------

class Bowl<F>(override val food: F) : Dish<F>

val bowlOfSoup: Bowl<Soup> = Bowl(Soup.TOMATO)
