package listing_16_15

// ---------------------------------------------------------------------------------
// Listing 16.15 - Updating the `Request` interface so that it’s a sealed interface.
// ---------------------------------------------------------------------------------

sealed interface Request {
    val id: Int
}
