package listing_20_12

// --------------------------------------------------------------------------------------------------------------------------------
// Listing 20.12 - Updating `order()` so that it is a suspending function that calls another suspending function - named `delay()`.
// --------------------------------------------------------------------------------------------------------------------------------

import kotlinx.coroutines.delay

suspend fun order(item: Product): Product {
    println("ORDER EN ROUTE  >>> The ${item.description} are on the way!")
    delay(item.deliveryTime)
    println("ORDER DELIVERED >>> Your ${item.description} have arrived.")
    return item
}

// --------------------------------------------------------------------------------------------------------------------------------

enum class Product(val description: String, val deliveryTime: Long) {
    DOORS("doors", 750),
    WINDOWS("windows", 1_250)
}
