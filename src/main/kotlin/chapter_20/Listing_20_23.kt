package listing_20_23

import kotlinx.coroutines.yield

// ---------------------------------------------------------------------------------------------------------------------
// Listing 20.23 - Splitting up long-running work into smaller units of work, using `yield()` to check for cancellation.
// ---------------------------------------------------------------------------------------------------------------------

suspend fun perform(taskName: String) {
    println("STARTING TASK   >>> $taskName")
    repeat(5) {
        Thread.sleep(200)
        yield()
    }
    println("FINISHED TASK   >>> $taskName")
}
