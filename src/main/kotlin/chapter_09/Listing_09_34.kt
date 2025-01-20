package listing_09_34

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

val toolWeightInPounds = tools.associateWith { tool -> tool.weightInOunces * 0.0625 }
val toolsByName = tools.associateBy { tool -> tool.name }
val hammer = toolsByName["Hammer"]

// ----------------------------------------
// Listing 9.34 - Using an object as a key.
// ----------------------------------------

fun main() {
    val hammerWeightInPounds = toolWeightInPounds[hammer]
}
