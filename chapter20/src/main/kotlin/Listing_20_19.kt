package listing_20_19

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

// ----------------------------------------------------------
// Listing 20.19 - Using withContext() to switch dispatchers.
// ----------------------------------------------------------

fun main() {
    runBlocking {
        launch(Dispatchers.IO) {
            val windows = order(Product.WINDOWS)
            withContext(Dispatchers.Default) {
                perform("install ${windows.description}")
            }
        }
        launch(Dispatchers.IO) {
            val doors = order(Product.DOORS)
            withContext(Dispatchers.Default) {
                perform("install ${doors.description}")
            }
        }
        launch(Dispatchers.Default) {
            perform("laying bricks")
        }
    }
}
