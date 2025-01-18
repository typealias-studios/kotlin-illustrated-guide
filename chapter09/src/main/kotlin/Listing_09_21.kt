package listing_09_21

var toolbox = mapOf(
    "Nail" to "Hammer",
    "Hex Nut" to "Wrench",
    "Hex Bolt" to "Wrench",
    "Slotted Screw" to "Slotted Screwdriver",
    "Phillips Screw" to "Phillips Screwdriver",
)

// ------------------------------------------------------
// Listing 9.21 - Using the `filter()` function on a map.
// ------------------------------------------------------

fun main() {
    val screwdrivers = toolbox.filter { entry -> 
        entry.value.contains("Screwdriver")
    }
}
