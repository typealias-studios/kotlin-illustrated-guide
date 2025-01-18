package listing_12_22

// --------------------------------------------------------------------------
// Listing 12.22 - Two interfaces, split out from the `FarmAnimal` interface.
// --------------------------------------------------------------------------

interface Speaker {
    fun speak()
}

interface Named {
    val name: String
}
