package listing_20_13

import kotlinx.coroutines.delay
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

// --------------------------------------------------------------
// Listing 20.13 - Assigning the result of a suspending function.
// --------------------------------------------------------------


fun main() {
    runBlocking {
        val windows = order(Product.WINDOWS)
        val doors = order(Product.DOORS)
        perform("laying bricks")
        perform("installing ${windows.description}")
        perform("installing ${doors.description}")
    }
}
