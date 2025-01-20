package listing_09_12

val toolbox = mapOf(
    "Nail" to "Hammer",
    "Hex Nut" to "Wrench",
    "Hex Bolt" to "Wrench",
    "Slotted Screw" to "Slotted Screwdriver",
    "Phillips Screw" to "Phillips Screwdriver",
)

// ------------------------------------------------------------------------------------------------------
// Listing 9.12 - Using `getOrDefault()` to provide a default value if the key does not exist in the map.
// ------------------------------------------------------------------------------------------------------

fun main() {
    val tool = toolbox.getOrDefault("Hanger Bolt", "Hand")
}
