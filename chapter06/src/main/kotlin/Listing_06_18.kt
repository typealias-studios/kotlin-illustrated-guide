package listing_06_18

class Payment
class Coffee

fun orderCoffee(payment: Payment?) = Coffee()

// -----------------------------------------------------------------------------------------
// Listing 6.18 - Error: Type mismatch. Required Payment / Found Payment? (does not compile)
// -----------------------------------------------------------------------------------------

fun main() {
    val payment: Payment? = Payment()
    val coffee = orderCoffee(payment)
}
