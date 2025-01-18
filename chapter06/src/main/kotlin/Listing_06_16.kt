package listing_06_16

class Payment
class Coffee

fun orderCoffee(payment: Payment?) = Coffee()

// -----------------------------------------------------------------------------------------
// Listing 6.16 - Error: Type mismatch. Required Payment / Found Payment? (does not compile)
// -----------------------------------------------------------------------------------------

fun main() {
    val payment: Payment? = Payment() // or you could set this to null
    val coffee = orderCoffee(payment)
}
