package listing_09_16

val toolbox = mutableMapOf(
    "Nail" to "Hammer",
    "Hex Nut" to "Wrench",
    "Hex Bolt" to "Wrench",
    "Slotted Screw" to "Slotted Screwdriver",
    "Phillips Screw" to "Phillips Screwdriver",
)

// -----------------------------------------------------------
// Listing 9.16 - Changing an existing value in a mutable map.
// -----------------------------------------------------------

fun main() {
    toolbox["Hex Bolt"] = "Nut Driver"
}
