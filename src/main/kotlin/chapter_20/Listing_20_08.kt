package listing_20_08

import kotlinx.coroutines.yield

// ------------------------------------------------------------------------------------------------------------------
// Listing 20.8 - Error: Suspend function `yield` should only be called from a coroutine or another suspend function.
// ------------------------------------------------------------------------------------------------------------------

fun tagOut() {
    println("    Tagging out!    ")
    // yield()
}
