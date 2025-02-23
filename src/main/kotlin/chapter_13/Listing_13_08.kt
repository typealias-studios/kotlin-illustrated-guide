package listing_13_08

enum class Entree { TOSSED_SALAD, SALMON_ON_RICE }
enum class Beverage { WATER, SODA, PEACH_ICED_TEA, TEA_LEMONADE }
enum class Appetizer
enum class Dessert

interface BarStaff {
    fun prepareBeverage(name: String): Beverage?
}

class Bartender : BarStaff {
    override fun prepareBeverage(name: String): Beverage? = when (name) {
        "Water"        -> Beverage.WATER
        "Soda"         -> Beverage.SODA
        "Peach Tea"    -> Beverage.PEACH_ICED_TEA
        "Tea-Lemonade" -> Beverage.TEA_LEMONADE
        else           -> null
    }
}

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
// Listing 13.8 - Manually delegating to the bartender object.
// -----------------------------------------------------------

class Waiter(
    private val chef: Chef,
    private val bartender: Bartender
) : KitchenStaff by chef, BarStaff {
    override fun prepareBeverage(name: String) = bartender.prepareBeverage(name)
    fun acceptPayment(money: Int) = println("Thank you for paying for your meal")
}
