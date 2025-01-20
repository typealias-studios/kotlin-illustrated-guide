package listing_12_29

// ------------------------------------
// Listing 12.29 - Interface extension.
// ------------------------------------

interface Speaker {
    fun speak()
}

interface Named {
    val name: String
}

interface FarmAnimal : Speaker, Named
