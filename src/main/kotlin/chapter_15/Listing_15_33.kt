package listing_15_33

val toolbox = mapOf(
    "Nail" to "Hammer",
    "Bolt" to "Wrench",
    "Screw" to "Screwdriver"
)

// ----------------------------------------------------------------
// Listing 15.33 - Printing the value and key of an `Entry` object.
// ----------------------------------------------------------------

fun main() {
    toolbox.forEach { entry ->
        println("Use a ${entry.value} on a ${entry.key}")
    }
}
