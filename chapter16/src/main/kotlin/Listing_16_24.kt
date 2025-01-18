package listing_16_24

// -------------------------------------------------------------------------------------------
// Listing 16.24 -  A sealed type is a good choice for representing individual schnauzer dogs.
// -------------------------------------------------------------------------------------------

// Subtypes of Schnauzer are limited to three:
sealed class Schnauzer(val name: String, val sound: String)
class MiniatureSchnauzer(name: String) : Schnauzer(name, "Yip! Yip!")
class StandardSchnauzer(name: String) : Schnauzer(name, "Bark!")
class GiantSchnauzer(name: String) : Schnauzer(name, "Ruuuuffff!")
