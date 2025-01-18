package listing_16_17

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

object HelpDesk {
    fun handle(request: SupportRequest) = println("Help desk is handling ${request.id}")
}

// -----------------------------------------------------------------------------
// Listing 16.17 - Adding a branch for `SupportRequest` fixes the compiler error
// -----------------------------------------------------------------------------

object FrontDesk {
    fun receive(request: Request) {
        println("Handling request #${request.id}")
        when (request) {
            is OrderRequest   -> IceCubeFactory.fulfillOrder(request)
            is RefundRequest  -> IceCubeFactory.fulfillRefund(request)
            is SupportRequest -> HelpDesk.handle(request)
        }
    }
}
