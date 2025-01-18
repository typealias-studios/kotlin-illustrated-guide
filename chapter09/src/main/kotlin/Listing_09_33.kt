package listing_09_33

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

// -------------------------------------------------------------------------------------------------------------
// Listing 9.33 - Calling `associateWith()` to create a map where the original list elements are the map's keys.
// -------------------------------------------------------------------------------------------------------------

fun main() {
    val toolWeightInPounds = tools.associateWith { tool ->
        tool.weightInOunces * 0.0625
    }
}
