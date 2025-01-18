package listing_09_24

var toolbox = mapOf(
    "Nail" to "Hammer",
    "Hex Nut" to "Wrench",
    "Hex Bolt" to "Wrench",
    "Slotted Screw" to "Slotted Screwdriver",
    "Phillips Screw" to "Phillips Screwdriver",
)

// ---------------------------------------------------------------------------------------
// Listing 9.24 - Using `getOrDefault()` can get out of hand when used at every call site.
// ---------------------------------------------------------------------------------------

fun main() {
    val tool = toolbox.getOrDefault("Hanger Bolt", "Hand")
    val another = toolbox.getOrDefault("Dowel Screw", "Hand")
    val oneMore = toolbox.getOrDefault("Eye Bolt", "Hand")
}
