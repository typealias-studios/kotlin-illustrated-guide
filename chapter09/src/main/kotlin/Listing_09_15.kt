package listing_09_15

val toolbox = mutableMapOf(
    "Nail" to "Hammer",
    "Hex Nut" to "Wrench",
    "Hex Bolt" to "Wrench",
    "Slotted Screw" to "Slotted Screwdriver",
    "Phillips Screw" to "Phillips Screwdriver",
)

// -------------------------------------------------------------------------------------
// Listing 9.15 - Adding a new entry to a mutable map using the indexed access operator.
// -------------------------------------------------------------------------------------

fun main() {
    toolbox["Lumber"] = "Saw"
}
