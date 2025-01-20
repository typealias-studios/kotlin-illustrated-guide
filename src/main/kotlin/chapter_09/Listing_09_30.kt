package listing_09_30

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

// ---------------------------------------------------------------------------------
// Listing 9.30 - Associating the properties in the reverse order from Listing 9.29.
// ---------------------------------------------------------------------------------

fun main() {
    val toolbox = tools.associate { tool ->
        tool.name to tool.correspondingHardware
    }
}
