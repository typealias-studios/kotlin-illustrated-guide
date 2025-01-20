package listing_16_04

enum class Size { CUP, BUCKET, BAG }

interface Request {
    val id: Int
}

class OrderRequest(override val id: Int, val size: Size) : Request
class RefundRequest(override val id: Int, val size: Size, val reason: String) : Request

object IceCubeFactory {
    fun fulfillOrder(order: OrderRequest) = println("Fulfilling order #${order.id}")
    fun fulfillRefund(refund: RefundRequest) = println("Fulfilling refund #${refund.id}")
}

// ---------------------------------------------------------------------------------
// Listing 16.4 - An object representing the front desk, which can receive requests.
// ---------------------------------------------------------------------------------

object FrontDesk {
    fun receive(request: Request) {
        println("Handling request #${request.id}")
        when (request) {
            is OrderRequest  -> IceCubeFactory.fulfillOrder(request)
            is RefundRequest -> IceCubeFactory.fulfillRefund(request)
        }
    }
}
