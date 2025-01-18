package listing_16_11

enum class Size { CUP, BUCKET, BAG }

interface Request {
    val id: Int
}

class OrderRequest(override val id: Int, val size: Size) : Request
class RefundRequest(override val id: Int, val size: Size, val reason: String) : Request
class SupportRequest(override val id: Int, val text: String) : Request

object IceCubeFactory {
    fun fulfillOrder(order: OrderRequest) = println("Fulfilling order #${order.id}")
    fun fulfillRefund(refund: RefundRequest) = println("Fulfilling refund #${refund.id}")
}

// -------------------------------------------------------------------------------------
// Listing 16.11 - The front desk does not include a `when` branch for `SupportRequest`.
// -------------------------------------------------------------------------------------

object FrontDesk {
    fun makeRequest(request: Request) {
        println("Handling request #${request.id}")
        when (request) {
            is OrderRequest  -> IceCubeFactory.fulfillOrder(request)
            is RefundRequest -> IceCubeFactory.fulfillRefund(request)
        }
    }
}
