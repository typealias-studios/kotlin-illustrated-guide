package listing_16_25

sealed class Schnauzer(val name: String, val sound: String)
class MiniatureSchnauzer(name: String) : Schnauzer(name, "Yip! Yip!")
class StandardSchnauzer(name: String) : Schnauzer(name, "Bark!")
class GiantSchnauzer(name: String) : Schnauzer(name, "Ruuuuffff!")

// --------------------------------------------------------------------------
// Listing 16.25 - Creating multiple instances of different schnauzer breeds.
// --------------------------------------------------------------------------

fun main() {
    // No limit on how many Schnauzer instances you can create:
    val dogs = listOf(
        MiniatureSchnauzer("Shadow"),
        StandardSchnauzer("Agent"),
        MiniatureSchnauzer("Scout"),
        GiantSchnauzer("Rex"),
        GiantSchnauzer("Brutus")
        // ... as many as you want ...
    )
}
