package listing_20_22

// ---------------------------------------------------------------------
// Listing 20.22 - The original `perform()` function, from Listing 20.2.
// ---------------------------------------------------------------------

fun perform(taskName: String) {
    println("STARTING TASK   >>> $taskName")
    Thread.sleep(1_000)
    println("FINISHED TASK   >>> $taskName")
}
