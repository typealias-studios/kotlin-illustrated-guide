@file:Suppress("UNREACHABLE_CODE")

package listing_20_25

import kotlinx.coroutines.*

enum class Product(val description: String, val deliveryTime: Long) {
    DOORS("doors", 750),
    WINDOWS("windows", 1_250)
}

suspend fun order(item: Product): Product {
    println("ORDER EN ROUTE  >>> The ${item.description} are on the way!")
    delay(item.deliveryTime)
    println("ORDER DELIVERED >>> Your ${item.description} have arrived.")
    return item
}

fun perform(taskName: String) {
    println("STARTING TASK   >>> $taskName")
    Thread.sleep(1_000)
    println("FINISHED TASK   >>> $taskName")
}

// ----------------------------------------------------------------------------
// Listing 20.25 - An uncaught exception cancels all of the related coroutines.
// ----------------------------------------------------------------------------

fun main() {
    runBlocking {
        val bricksJob = launch(Dispatchers.Default) {
            perform("laying bricks")
        }
        launch(Dispatchers.IO) {
            val windows = order(Product.WINDOWS)
            bricksJob.join()
            withContext(Dispatchers.Default) { perform("install ${windows.description}") }
        }
        launch(Dispatchers.IO) {
            val doors = order(Product.DOORS)
            throw Exception("Out of money!")
            bricksJob.join()
            withContext(Dispatchers.Default) { perform("install ${doors.description}") }
        }
    }
}
