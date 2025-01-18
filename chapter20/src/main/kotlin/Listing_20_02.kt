package listing_20_02

// -------------------------------------------------------------
// Listing 20.2 - A function that simulates performing some task
// -------------------------------------------------------------

fun perform(taskName: String) {
    println("STARTING TASK   >>> $taskName")
    Thread.sleep(1_000)
    println("FINISHED TASK   >>> $taskName")
}
