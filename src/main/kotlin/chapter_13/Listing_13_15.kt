package listing_13_15

enum class Entree { TOSSED_SALAD, SALMON_ON_RICE }
enum class Beverage { WATER, SODA, PEACH_ICED_TEA, TEA_LEMONADE }
enum class Appetizer
enum class Dessert

interface BarStaff {
    fun prepareBeverage(name: String): Beverage?
    fun receiveCompliment(message: String)
}

class Bartender : BarStaff {
    override fun prepareBeverage(name: String): Beverage? = when (name) {
        "Water"        -> Beverage.WATER
        "Soda"         -> Beverage.SODA
        "Peach Tea"    -> Beverage.PEACH_ICED_TEA
        "Tea-Lemonade" -> Beverage.TEA_LEMONADE
        else           -> null
    }

    override fun receiveCompliment(message: String) =
        println("Bartender received a compliment: $message")
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
    override fun receiveCompliment(message: String) =
        println("Chef received a compliment: $message")
}

class Waiter(
    private val chef: Chef,
    private val bartender: Bartender
) : KitchenStaff by chef, BarStaff by bartender {
    override fun receiveCompliment(message: String) = when {
        message.contains("entree")   -> chef.receiveCompliment(message)
        message.contains("beverage") -> bartender.receiveCompliment(message)
        else                         -> println("Waiter received compliment: $message")
    }

    override fun prepareEntree(name: String): Entree? =
        if (name == "Tossed Salad") Entree.TOSSED_SALAD else chef.prepareEntree(name)

    fun acceptPayment(money: Int) = println("Thank you for paying for your meal")
}

// -------------------------------------------------------------------------------
// Listing 13.15 - Sending compliments to the chef, the bartender, and the waiter.
// -------------------------------------------------------------------------------

fun main() {
    val waiter = Waiter(Chef(), Bartender())
    
    waiter.receiveCompliment("The salmon entree was fantastic!")
    waiter.receiveCompliment("The peach tea beverage was fantastic!")
    waiter.receiveCompliment("The service was fantastic!")
}
