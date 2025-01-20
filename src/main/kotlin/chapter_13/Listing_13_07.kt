package listing_13_07

// ---------------------------------------------------------------
// Listing 13.7 - Adding an interface and class for the bartender.
// ---------------------------------------------------------------

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

enum class Beverage { WATER, SODA, PEACH_ICED_TEA, TEA_LEMONADE }
