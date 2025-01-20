package listing_13_11

// -----------------------------------------------------------------------
// Listing 13.11 - Implementing receiveCompliment() inside the Chef class.
// -----------------------------------------------------------------------

interface KitchenStaff {
    // ... disregarding other properties and functions ...
    fun receiveCompliment(message: String)
}

class Chef : KitchenStaff {
    // ... disregarding other properties and functions ...
    override fun receiveCompliment(message: String) =
        println("Chef received a compliment: $message")
}
