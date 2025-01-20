package listing_09_23

var toolbox = mapOf(
    "Nail" to "Hammer",
    "Hex Nut" to "Wrench",
    "Hex Bolt" to "Wrench",
    "Slotted Screw" to "Slotted Screwdriver",
    "Phillips Screw" to "Phillips Screwdriver",
)

// -----------------------------------------------------
// Listing 9.23 - Mapping both keys and values of a map.
// -----------------------------------------------------

fun main() {
    val newToolbox = toolbox
        .mapKeys { entry -> entry.key.replace("Hex", "Flange") }
        .mapValues { entry -> entry.value.replace("Wrench", "Ratchet") }
}
