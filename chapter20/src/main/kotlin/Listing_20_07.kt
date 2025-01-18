package listing_20_07

// ---------------------------------------------------------------------
// Listing 20.7 - Yielding the coroutine after each call to `println()`.
// ---------------------------------------------------------------------

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.yield

fun main() {
    runBlocking {
        launch {
            println("Hammer: Clothesline!")
            yield()
            println("Hammer: Piledriver!")
            yield()
        }
        println("Sledge: Suplex!")
        yield()
        println("Sledge: Figure-four Leglock!")
        yield()
        println("Sledge: Pinning 1-2-3!")
    }
}
