package listing_15_34

val toolbox = mapOf(
    "Nail" to "Hammer",
    "Bolt" to "Wrench",
    "Screw" to "Screwdriver"
)

// ------------------------------------------------
// Listing 15.34 - Destructuring an `Entry` object.
// ------------------------------------------------

fun main() {
    toolbox.forEach { (hardware, tool) ->
        println("Use a $tool on a $hardware")
    }
}
