package listing_13_03

enum class Entree { TOSSED_SALAD, SALMON_ON_RICE }
enum class Beverage { WATER, SODA }

// ----------------------------------------------------------------------------------
// Listing 13.3 - Updating Chef and Waiter to implement a new KitchenStaff interface.
// ----------------------------------------------------------------------------------

interface KitchenStaff {
    fun prepareEntree(name: String): Entree?
}

class Chef : KitchenStaff {
    override fun prepareEntree(name: String): Entree? = when (name) {
        "Tossed Salad"   -> Entree.TOSSED_SALAD
        "Salmon on Rice" -> Entree.SALMON_ON_RICE
        else             -> null
    }
}

class Waiter(private val chef: Chef) : KitchenStaff {
    fun prepareBeverage(name: String): Beverage? = when (name) {
        "Water" -> Beverage.WATER
        "Soda"  -> Beverage.SODA
        else    -> null
    }

    override fun prepareEntree(name: String): Entree? = chef.prepareEntree(name)
    fun acceptPayment(money: Int) = println("Thank you for paying for your meal")
}
