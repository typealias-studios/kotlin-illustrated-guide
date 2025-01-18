package listing_20_04

// -----------------------------------
// Listing 20.4 - Our first coroutine!
// -----------------------------------

import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        println("Sledge: Suplex!")
        println("Hammer: Clothesline!")
        println("Sledge: Figure-four Leglock!")
        println("Hammer: Piledriver!")
        println("Sledge: Pinning 1-2-3!")
    }
}
