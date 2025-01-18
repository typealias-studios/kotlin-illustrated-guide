package listing_16_22

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

val request: Request = SupportRequest("I can't open the bag of ice!")

// -----------------------------------------------------
// Listing 16.22 - Exhaustive matching for sealed types.
// -----------------------------------------------------

fun main() {
    when (request) {
        is OrderRequest   -> IceCubeFactory.fulfillOrder(request)
        is RefundRequest  -> IceCubeFactory.fulfillRefund(request)
        is SupportRequest -> HelpDesk.handle(request)
    }
}
