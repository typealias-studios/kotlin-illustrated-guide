package listing_16_19

enum class Size { CUP, BUCKET, BAG }

sealed class Request {
    val id: Int = kotlin.random.Random.nextInt()
}

// --------------------------------------------------------------------------------------------------------------------------------
// Listing 16.19 - Updating the subtypes so that they extend the Request class (instead of implementing the old Request interface).
// --------------------------------------------------------------------------------------------------------------------------------

class OrderRequest(val size: Size) : Request()
class RefundRequest(val size: Size, val reason: String) : Request()
class SupportRequest(val text: String) : Request()
