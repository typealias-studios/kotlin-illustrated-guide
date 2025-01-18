package listing_09_09

val toolbox = mapOf(
    "Nail" to "Hammer",
    "Hex Nut" to "Wrench",
    "Hex Bolt" to "Wrench",
    "Slotted Screw" to "Slotted Screwdriver",
    "Phillips Screw" to "Phillips Screwdriver",
)

// --------------------------------------------------------------------------
// Listing 9.9 - Getting a value from a map by the value's corresponding key.
// --------------------------------------------------------------------------

fun main() {
    val tool = toolbox.get("Nail")
    println(tool) // Hammer
}
