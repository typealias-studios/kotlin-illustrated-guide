package listing_09_14

val toolbox = mutableMapOf(
    "Nail" to "Hammer",
    "Hex Nut" to "Wrench",
    "Hex Bolt" to "Wrench",
    "Slotted Screw" to "Slotted Screwdriver",
    "Phillips Screw" to "Phillips Screwdriver",
)

// ------------------------------------------------------------------------------
// Listing 9.14 - Adding a new entry to a mutable map using the `put()` function.
// ------------------------------------------------------------------------------

fun main() {
    toolbox.put("Lumber", "Saw")
}
