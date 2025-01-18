package listing_20_05

// ----------------------------------------------------
// Listing 20.5 - Nesting one coroutine within another.
// ----------------------------------------------------

import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        runBlocking {
            println("Hammer: Clothesline!")
            println("Hammer: Piledriver!")
        }
        println("Sledge: Suplex!")
        println("Sledge: Figure-four Leglock!")
        println("Sledge: Pinning 1-2-3!")
    }
}
