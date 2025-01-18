package listing_09_18

val toolbox = mutableMapOf(
    "Nail" to "Hammer",
    "Hex Nut" to "Wrench",
    "Hex Bolt" to "Wrench",
    "Slotted Screw" to "Slotted Screwdriver",
    "Phillips Screw" to "Phillips Screwdriver",
)

// -----------------------------------------------------------------------------------------------
// Listing 9.18 - Removing an entry and reinserting it with a new key, to simulate changing a key.
// -----------------------------------------------------------------------------------------------

fun main() {
    toolbox.remove("Phillips Screw")
    toolbox["Cross Recess Screw"] = "Phillips Screwdriver"
}
