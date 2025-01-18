package listing_16_07

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

object FrontDesk {
    fun receive(request: Request) {
        println("Handling request #${request.id}")
        when (request) {
            is OrderRequest  -> IceCubeFactory.fulfillOrder(request)
            is RefundRequest -> IceCubeFactory.fulfillRefund(request)
        }
    }
}

// ---------------------------------------------------------------------------------------------
// Listing 16.7 - Passing a refund request to the front desk, which is forwarded to the factory.
// ---------------------------------------------------------------------------------------------

fun main() {
    val refund = RefundRequest(456, Size.CUP, "Accidentally ordered too much")
    FrontDesk.receive(refund)
}
