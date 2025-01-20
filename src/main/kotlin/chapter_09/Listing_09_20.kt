package listing_09_20

var toolbox = mapOf(
    "Nail" to "Hammer",
    "Hex Nut" to "Wrench",
    "Hex Bolt" to "Wrench",
    "Slotted Screw" to "Slotted Screwdriver",
    "Phillips Screw" to "Phillips Screwdriver",
)

// -------------------------------------------------------
// Listing 9.20 - Using the `forEach()` function on a map.
// -------------------------------------------------------

fun main() {
    toolbox.forEach { entry -> 
        println("Use a ${entry.value} on a ${entry.key}") 
    }
}
