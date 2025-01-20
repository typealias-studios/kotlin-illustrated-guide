package listing_15_36

val toolbox = mapOf(
    "Nail" to "Hammer",
    "Bolt" to "Wrench",
    "Screw" to "Screwdriver"
)

// --------------------------------------------------------------------------------------------------------
// Listing 15.36 - Using an underscore to avoid creating a variable for the first value when destructuring.
// --------------------------------------------------------------------------------------------------------

fun main() {
    toolbox.forEach { (_, tool) ->
        println("Found a $tool")
    }
}
