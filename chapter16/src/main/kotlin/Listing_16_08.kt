package listing_16_08

enum class Size { CUP, BUCKET, BAG }

interface Request {
    val id: Int
}

class OrderRequest(override val id: Int, val size: Size) : Request
class RefundRequest(override val id: Int, val size: Size, val reason: String) : Request

// -------------------------------------------------------------------
// Listing 16.8 - A third class that implements the Request interface.
// -------------------------------------------------------------------

class SupportRequest(override val id: Int, val text: String) : Request
