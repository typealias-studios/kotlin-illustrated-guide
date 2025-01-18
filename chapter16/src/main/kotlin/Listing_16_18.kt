package listing_16_18

// ----------------------------------------------------------------
// Listing 16.18 - Converting a sealed interface to a sealed class.
// ----------------------------------------------------------------

sealed class Request {
    val id: Int = kotlin.random.Random.nextInt()
}
