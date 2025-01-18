package listing_07_11

// -----------------------------------------------------------------------------
// Listing 7.11 - Demonstrates a function type that has more than one parameter.
// -----------------------------------------------------------------------------

fun menuItemDescription(name: String, price: Double): String =
    "A $name costs $price before discounts and tax."

val describeMenuItem: (String, Double) -> String = ::menuItemDescription
