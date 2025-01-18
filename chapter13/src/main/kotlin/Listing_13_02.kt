package listing_13_02

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

// -----------------------------------------------------
// Listing 13.2 - Simulating the behavior of a customer.
// -----------------------------------------------------

fun main() {
    val waiter = Waiter(Chef())
    
    val beverage = waiter.prepareBeverage("Soda")
    val entree = waiter.prepareEntree("Salmon on Rice")
}
