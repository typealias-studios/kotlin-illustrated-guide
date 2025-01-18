package listing_16_05

enum class Size { CUP, BUCKET, BAG }

interface Request {
    val id: Int
}

class OrderRequest(override val id: Int, val size: Size) : Request
class RefundRequest(override val id: Int, val size: Size, val reason: String) : Request

// ---------------------------------------------------------------------------------------------------------
// Listing 16.5 - An object representing the ice cube factory, which prints out the orders that it receives.
// ---------------------------------------------------------------------------------------------------------

object IceCubeFactory {
    fun fulfillOrder(order: OrderRequest) = println("Fulfilling order #${order.id}")
    fun fulfillRefund(refund: RefundRequest) = println("Fulfilling refund #${refund.id}")
}
