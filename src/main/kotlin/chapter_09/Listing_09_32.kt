package listing_09_32

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

val toolsByName = tools.associateBy { tool -> tool.name }

// -------------------------------------------------------
// Listing 9.32 - Getting a `Tool` from a map by its name.
// -------------------------------------------------------

fun main() {
    val hammer = toolsByName["Hammer"]
}
