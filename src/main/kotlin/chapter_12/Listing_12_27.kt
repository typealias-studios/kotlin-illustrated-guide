package listing_12_27

// ---------------------------------------------------------------------------------
// Listing 12.27 - Duplicating the `Speaker` and `Named` interfaces in `FarmAnimal`.
// ---------------------------------------------------------------------------------

interface Speaker {
    fun speak()
}

interface Named {
    val name: String
}

interface FarmAnimal {
    val name: String
    fun speak()
}
