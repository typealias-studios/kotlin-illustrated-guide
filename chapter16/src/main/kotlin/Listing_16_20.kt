package listing_16_20

enum class Size { CUP, BUCKET, BAG }

sealed class Request {
    val id: Int = kotlin.random.Random.nextInt()
}

class OrderRequest(val size: Size) : Request()
class RefundRequest(val size: Size, val reason: String) : Request()
class SupportRequest(val text: String) : Request()


object IceCubeFactory {
    fun fulfillOrder(order: OrderRequest) = println("Fulfilling order #${order.id}")
    fun fulfillRefund(refund: RefundRequest) = println("Fulfilling refund #${refund.id}")
}

object HelpDesk {
    fun handle(request: SupportRequest) = println("Help desk is handling ${request.id}")
}

// ------------------------------------------------------
// Listing 16.20 - The FrontDesk code from Listing 16.17.
// ------------------------------------------------------

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
