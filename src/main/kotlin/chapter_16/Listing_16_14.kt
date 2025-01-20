package listing_16_14

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

val request: Request = SupportRequest(789, "I can't open the bag of ice!")

// ------------------------------------------------------------------------------------------
// Listing 16.14 - How can we get this `when` conditional to create a similar compiler error?
// ------------------------------------------------------------------------------------------

fun main() {
    when (request) {
        is OrderRequest  -> IceCubeFactory.fulfillOrder(request)
        is RefundRequest -> IceCubeFactory.fulfillRefund(request)
    }
}
