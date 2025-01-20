package listing_20_10

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.yield

suspend fun tagOut() {
    println("    Tagging out!    ")
    yield()
}

// -------------------------------------------------------------------------
// Listing 20.10 - Calling `tagOut()` instead of directly calling `yield()`.
// -------------------------------------------------------------------------

fun main() {
    runBlocking {
        launch {
            println("Hammer: Clothesline!")
            tagOut()
            println("Hammer: Piledriver!")
            tagOut()
        }
        println("Sledge: Suplex!")
        tagOut()
        println("Sledge: Figure-four Leglock!")
        tagOut()
        println("Sledge: Pinning 1-2-3!")
    }
}
