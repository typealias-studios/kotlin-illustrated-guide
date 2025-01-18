package listing_09_29

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

// --------------------------------------------------------------------------------------
// Listing 9.29 - Creating a map by associating two properties in the elements of a list.
// --------------------------------------------------------------------------------------

fun main() {
    val toolbox = tools.associate { tool ->
        tool.correspondingHardware to tool.name
    }
}
