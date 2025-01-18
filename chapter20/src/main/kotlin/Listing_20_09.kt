package listing_20_09

import kotlinx.coroutines.yield

// ---------------------------------------------
// Listing 20.9 - Our first suspending function!
// ---------------------------------------------

suspend fun tagOut() {
    println("    Tagging out!    ")
    yield()
}
