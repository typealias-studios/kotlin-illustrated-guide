package listing_09_36

class Tool(
    val name: String,
    val weightInOunces: Int,
    val correspondingHardware: String,
)

val tools = listOf(
    Tool("Hammer", 14, "Nail"),
    Tool("Wrench", 8, "Hex Nut"),
    Tool("Wrench", 8, "Hex Bolt"),
    Tool("Slotted Screwdriver", 5, "Slotted Screw"),
    Tool("Phillips Screwdriver", 5, "Phillips Screw"),
)

// ----------------------------------------------------------------------------------
// Listing 9.36 - Calling the `groupBy()` function with two arguments instead of one.
// ----------------------------------------------------------------------------------

fun main() {
    val toolNamesByWeight = tools.groupBy(
        { tool -> tool.weightInOunces }, 
        { tool -> tool.name }
    )
}
