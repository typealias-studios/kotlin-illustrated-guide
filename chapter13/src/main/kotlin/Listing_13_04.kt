package listing_13_04

enum class Entree { TOSSED_SALAD, SALMON_ON_RICE }
enum class Beverage { WATER, SODA }
enum class Appetizer
enum class Dessert

// -----------------------------------------------------------------
// Listing 13.4 - Adding more members to the KitchenStaff interface.
// -----------------------------------------------------------------

interface KitchenStaff {
    val specials: List<String>
    fun prepareEntree(name: String): Entree?
    fun prepareAppetizer(name: String): Appetizer?
    fun prepareDessert(name: String): Dessert?
    fun receiveCompliment(message: String)
}
