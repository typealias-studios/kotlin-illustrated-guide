package listing_20_17

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

// ---------------------------------------------------------
// Listing 20.17 - Running tasks on three different threads.
// ---------------------------------------------------------

fun main() {
    runBlocking {
        val windows = async(Dispatchers.IO) { order(Product.WINDOWS) }
        val doors = async(Dispatchers.IO) { order(Product.DOORS) }
        launch(Dispatchers.Default) {
            perform("laying bricks")
            perform("install ${windows.await().description}")
            perform("install ${doors.await().description}")
        }
    }
}
