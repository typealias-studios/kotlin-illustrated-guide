package listing_16_03

enum class Size { CUP, BUCKET, BAG }

interface Request {
    val id: Int
}

// --------------------------------------------------------------
// Listing 16.3 - Two classes implementing the Request interface.
// --------------------------------------------------------------

class OrderRequest(override val id: Int, val size: Size) : Request
class RefundRequest(override val id: Int, val size: Size, val reason: String) : Request
