package listing_13_06

enum class Entree { TOSSED_SALAD, SALMON_ON_RICE }
enum class Beverage { WATER, SODA }
enum class Appetizer
enum class Dessert

interface KitchenStaff {
    val specials: List<String>
    fun prepareEntree(name: String): Entree?
    fun prepareAppetizer(name: String): Appetizer?
    fun prepareDessert(name: String): Dessert?
    fun receiveCompliment(message: String)
}

class Chef : KitchenStaff {
    override val specials: List<String> = listOf()
    override fun prepareEntree(name: String): Entree? = null
    override fun prepareAppetizer(name: String): Appetizer? = null
    override fun prepareDessert(name: String): Dessert? = null
    override fun receiveCompliment(message: String) = Unit
}

// -----------------------------------------------------------
// Listing 13.6 - Automatically delegating to the chef object.
// -----------------------------------------------------------

class Waiter(private val chef: Chef) : KitchenStaff by chef {
    fun prepareBeverage(name: String): Beverage? = when (name) { /* ... */ else -> Beverage.WATER }
    fun acceptPayment(money: Int) = println("Thank you for paying for your meal")
}
