package listing_13_01

// --------------------------------------------------------
// Listing 13.1 - Modeling out the Chef and Waiter classes.
// --------------------------------------------------------

class Chef {
    fun prepareEntree(name: String): Entree? = when (name) {
        "Tossed Salad"   -> Entree.TOSSED_SALAD
        "Salmon on Rice" -> Entree.SALMON_ON_RICE
        else             -> null
    }
}

class Waiter(private val chef: Chef) {
    // The waiter can prepare a beverage by himself...
    fun prepareBeverage(name: String): Beverage? = when (name) {
        "Water" -> Beverage.WATER
        "Soda"  -> Beverage.SODA
        else    -> null
    }

    // ... but needs the chef to prepare an entree
    fun prepareEntree(name: String): Entree? = chef.prepareEntree(name)

    fun acceptPayment(money: Int) = println("Thank you for paying for your meal")
}

enum class Entree { TOSSED_SALAD, SALMON_ON_RICE }
enum class Beverage { WATER, SODA }
