package listing_09_10

val toolbox = mapOf(
    "Nail" to "Hammer",
    "Hex Nut" to "Wrench",
    "Hex Bolt" to "Wrench",
    "Slotted Screw" to "Slotted Screwdriver",
    "Phillips Screw" to "Phillips Screwdriver",
)

// ---------------------------------------------------------------------------
// Listing 9.10 - Using the indexed access operator to get a value from a map.
// ---------------------------------------------------------------------------

fun main() {
    val tool = toolbox["Nail"]
    println(tool) // Hammer
}
