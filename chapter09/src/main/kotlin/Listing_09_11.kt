package listing_09_11

val toolbox = mapOf(
    "Nail" to "Hammer",
    "Hex Nut" to "Wrench",
    "Hex Bolt" to "Wrench",
    "Slotted Screw" to "Slotted Screwdriver",
    "Phillips Screw" to "Phillips Screwdriver",
)

// ---------------------------------------------------------------------------------------
// Listing 9.11 - Using the `getValue()` function to get a value with a non-nullable type.
// ---------------------------------------------------------------------------------------

fun main() {
    val tool = toolbox.getValue("Nail")
    println(tool) // Hammer
    
    val anotherTool = toolbox.getValue("Wing Nut") // Error at runtime
}
