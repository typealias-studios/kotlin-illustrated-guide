package listing_13_05

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

// ---------------------------------------------------------------------------------
// Listing 13.5 - Overriding the new properties and functions in the `Waiter` class.
// ---------------------------------------------------------------------------------

class Waiter(private val chef: Chef) : KitchenStaff {
    // These first two functions are the same as before
    fun prepareBeverage(name: String): Beverage? = when (name) {
        "Water" -> Beverage.WATER
        "Soda"  -> Beverage.SODA
        else    -> null
    }

    fun acceptPayment(money: Int) = println("Thank you for paying for your meal")

    // Manually delegating to the chef for all of these things:
    override val specials: List<String> get() = chef.specials
    override fun prepareEntree(name: String) = chef.prepareEntree(name)
    override fun prepareAppetizer(name: String) = chef.prepareAppetizer(name)
    override fun prepareDessert(name: String) = chef.prepareDessert(name)
    override fun receiveCompliment(message: String) = chef.receiveCompliment(message)
}
