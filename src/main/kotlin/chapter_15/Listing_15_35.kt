package listing_15_35

val toolbox = mapOf(
    "Nail" to "Hammer",
    "Bolt" to "Wrench",
    "Screw" to "Screwdriver"
)

// -----------------------------------------------------------------------------
// Listing 15.35 - Using only one variable from a destructured lambda parameter.
// -----------------------------------------------------------------------------

fun main() {
    toolbox.forEach { (hardware, tool) ->
        println("Found a $tool")
    }
}
