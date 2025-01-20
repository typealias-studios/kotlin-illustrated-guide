package listing_14_06

// ---------------------------------------------------------------------
// Listing 14.6 - Inheriting a default implementation from an interface.
// ---------------------------------------------------------------------

interface Speaker {
    fun speak() = println("...")
}

class Cow : Speaker
