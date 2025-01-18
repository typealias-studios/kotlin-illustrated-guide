package listing_09_26

var toolbox = mapOf(
    "Nail" to "Hammer",
    "Hex Nut" to "Wrench",
    "Hex Bolt" to "Wrench",
    "Slotted Screw" to "Slotted Screwdriver",
    "Phillips Screw" to "Phillips Screwdriver",
)

// ---------------------------------------------------------------------------------------------------------
// Listing 9.26 - Calling `getValue()` instead of `getOrDefault()`, because the new map has a default value.
// ---------------------------------------------------------------------------------------------------------

fun main() {
    val tool = toolbox.getValue("Hanger Bolt")
    val anotherTool = toolbox.getValue("Dowel Screw")
    val oneMoreTool = toolbox.getValue("Eye Bolt")
}
