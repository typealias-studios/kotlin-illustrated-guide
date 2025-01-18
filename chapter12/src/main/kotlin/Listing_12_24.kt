package listing_12_24

interface Speaker {
    fun speak()
}

interface Named {
    val name: String
}

// ----------------------------------------------------------------------------------------
// Listing 12.24 - Updating the `Farmer` class so that it implements the `Named` interface.
// ----------------------------------------------------------------------------------------

class Farmer(override val name: String) : Named {
    // (eliding the class body for now)
}
