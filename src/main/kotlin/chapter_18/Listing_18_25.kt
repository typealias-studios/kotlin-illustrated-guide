package listing_18_25

interface Dish<T> { val food: T }
interface Food
enum class Pastry : Food { MUFFIN, BAGEL }
enum class Soup : Food { TOMATO, CHICKEN_NOODLE }

// ----------------------------------------------------------------------
// Listing 18.25 - Implementing the generic interface from Listing 18.24.
// ----------------------------------------------------------------------

class BowlOfSoup(override val food: Soup) : Dish<Soup>
val bowlOfSoup: BowlOfSoup = BowlOfSoup(Soup.TOMATO)
