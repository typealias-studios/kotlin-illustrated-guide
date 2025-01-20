package listing_16_16

enum class Size { CUP, BUCKET, BAG }

sealed interface Request {
    val id: Int
}

class OrderRequest(override val id: Int, val size: Size) : Request
class RefundRequest(override val id: Int, val size: Size, val reason: String) : Request
class SupportRequest(override val id: Int, val text: String) : Request

object IceCubeFactory {
    fun fulfillOrder(order: OrderRequest) = println("Fulfilling order #${order.id}")
    fun fulfillRefund(refund: RefundRequest) = println("Fulfilling refund #${refund.id}")
}

// -------------------------------------------------------------------------------------------------------------------------------
// Listing 16.16 - Error: 'when' expression must be exhaustive, add necessary 'is SupportRequest' branch or 'else' branch instead.
// -------------------------------------------------------------------------------------------------------------------------------

object FrontDesk {
    fun receive(request: Request) {
        println("Handling request #${request.id}")
        // when (request) {
        //     is OrderRequest  -> IceCubeFactory.fulfillOrder(request)
        //     is RefundRequest -> IceCubeFactory.fulfillRefund(request)
        // }
    }
}
