package listing_16_10

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

object FrontDesk {
    fun receive(request: Request) {
        println("Handling request #${request.id}")
        when (request) {
            is OrderRequest  -> IceCubeFactory.fulfillOrder(request)
            is RefundRequest -> IceCubeFactory.fulfillRefund(request)
        }
    }
}

// ------------------------------------------------------------
// Listing 16.10 - Passing a support request to the front desk.
// ------------------------------------------------------------

fun main() {
    val request = SupportRequest(789, "I can't open the bag of ice!")
    FrontDesk.receive(request)
}
