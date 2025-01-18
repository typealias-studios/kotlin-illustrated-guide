package listing_20_01

// ------------------------------------------------------------------------------------------------------------
// Listing 20.1 - An enum class representing products, along with a function that simulates ordering a product.
// ------------------------------------------------------------------------------------------------------------

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
