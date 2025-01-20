package listing_20_03

enum class Product(val description: String, val deliveryTime: Long) {
    DOORS("doors", 750),
    WINDOWS("windows", 1_250)
}

fun order(item: Product): Product {
    println("ORDER EN ROUTE  >>> The ${item.description} are on the way!")
    Thread.sleep(item.deliveryTime)
    println("ORDER DELIVERED >>> Your ${item.description} have arrived.")
    return item
}

fun perform(taskName: String) {
    println("STARTING TASK   >>> $taskName")
    Thread.sleep(1_000)
    println("FINISHED TASK   >>> $taskName")
}

// -------------------------------------------------------------------------------------------
// Listing 20.3 - Modeling Rusty’s project by calling the `order()` and `perform()` functions.
// -------------------------------------------------------------------------------------------

fun main() {
    val windows = order(Product.WINDOWS)
    val doors = order(Product.DOORS)
    perform("laying bricks")
    perform("installing ${windows.description}")
    perform("installing ${doors.description}")
}
