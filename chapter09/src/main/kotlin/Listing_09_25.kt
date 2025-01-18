package listing_09_25

var toolbox = mapOf(
    "Nail" to "Hammer",
    "Hex Nut" to "Wrench",
    "Hex Bolt" to "Wrench",
    "Slotted Screw" to "Slotted Screwdriver",
    "Phillips Screw" to "Phillips Screwdriver",
)

// -----------------------------------------------------------
// Listing 9.25 - Creating a new map that has a default value.
// -----------------------------------------------------------

fun main() {
    toolbox = toolbox.withDefault { key -> "Hand" }
}
