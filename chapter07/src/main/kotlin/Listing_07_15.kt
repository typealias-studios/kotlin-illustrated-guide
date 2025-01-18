package listing_07_15

// ------------------------------------------------------
// Listing 7.15 - Error: Type Mismatch (does not compile)
// ------------------------------------------------------

fun main() {
    fun menuItemDescription(name: String, price: Double): String =
        "A $name costs $price before discounts and tax."
    
    fun sillyMenuItemDescription(price: Double, name: String): String =
        "You want a $name? It's gonna run you $price, not counting coupons, tax, and whatnot!"
    
    var describeMenuItem = ::menuItemDescription
    // describeMenuItem = ::sillyMenuItemDescription
}
