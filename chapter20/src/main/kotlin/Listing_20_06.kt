package listing_20_06

// ----------------------------------------------------
// Listing 20.6 - Using the launch() coroutine builder.
// ----------------------------------------------------

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        launch {
            println("Hammer: Clothesline!")
            println("Hammer: Piledriver!")
        }
        println("Sledge: Suplex!")
        println("Sledge: Figure-four Leglock!")
        println("Sledge: Pinning 1-2-3!")
    }
}
