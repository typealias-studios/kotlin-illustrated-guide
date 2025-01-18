package listing_20_11

import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.client.request.*
import io.ktor.client.statement.*

val client = HttpClient(CIO)

// -------------------------------------------------------------------------------------------------------------------
// Listing 20.11 - An suspending function that calls another suspending function, named `get()`, in the Ktor library,.
// -------------------------------------------------------------------------------------------------------------------

suspend fun getExample(): String {
    return client.get("https://www.example.com/").bodyAsText()
}
