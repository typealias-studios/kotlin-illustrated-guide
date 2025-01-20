package listing_16_09

interface Request {
    val id: Int
}

class SupportRequest(override val id: Int, val text: String) : Request

// -------------------------------------------------------------------------------------------------------------
// Listing 16.9 - An object that handles `SupportRequest` objects. Here it just prints out that it was received.
// -------------------------------------------------------------------------------------------------------------

object HelpDesk {
    fun handle(request: SupportRequest) = println("Help desk is handling ${request.id}")
}
