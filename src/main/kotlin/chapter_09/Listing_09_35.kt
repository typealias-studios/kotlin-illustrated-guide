package listing_09_35

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

// ---------------------------------------------------------------------------------------
// Listing 9.35 - Using the `groupBy()` function to group a list of tools by their weight.
// ---------------------------------------------------------------------------------------

fun main() {
    val toolsByWeight = tools.groupBy { tool ->
        tool.weightInOunces
    }
}
