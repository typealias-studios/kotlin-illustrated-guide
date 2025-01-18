package listing_09_28

class Tool(
    val name: String,
    val weightInOunces: Int,
    val correspondingHardware: String,
)

// ----------------------------------------
// Listing 9.28 - Creating a list of tools.
// ----------------------------------------

fun main() {
    val tools = listOf(
        Tool("Hammer", 14, "Nail"),
        Tool("Wrench", 8, "Hex Nut"),
        Tool("Wrench", 8, "Hex Bolt"),
        Tool("Slotted Screwdriver", 5, "Slotted Screw"),
        Tool("Phillips Screwdriver", 5, "Phillips Screw"),
    )
}
