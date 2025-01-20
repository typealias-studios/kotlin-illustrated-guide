package listing_09_17

val toolbox = mutableMapOf(
    "Nail" to "Hammer",
    "Hex Nut" to "Wrench",
    "Hex Bolt" to "Wrench",
    "Slotted Screw" to "Slotted Screwdriver",
    "Phillips Screw" to "Phillips Screwdriver",
)

// --------------------------------------------
// Listing 9.17 - Removing an entry from a map.
// --------------------------------------------

fun main() {
    toolbox.remove("Lumber")
}
