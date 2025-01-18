package listing_09_22

var toolbox = mapOf(
    "Nail" to "Hammer",
    "Hex Nut" to "Wrench",
    "Hex Bolt" to "Wrench",
    "Slotted Screw" to "Slotted Screwdriver",
    "Phillips Screw" to "Phillips Screwdriver",
)

// --------------------------------------------------------
// Listing 9.22 - Filtering a map based on the entry's key.
// --------------------------------------------------------

fun main() {
    val screwdrivers = toolbox.filter { entry ->
        entry.key.contains("Screw")
    }
}
