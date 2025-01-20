package listing_20_14

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

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

// --------------------------------------------------------
// Listing 20.14 - Error: Unresolved reference: description
// --------------------------------------------------------

fun main() {
    runBlocking {
        val windows = launch { order(Product.WINDOWS) }
        val doors = launch { order(Product.DOORS) }
        launch {
            perform("laying bricks")
            // perform("install ${windows.description}")
            // perform("install ${doors.description}")
        }
    }
}
