package listing_06_13

class Payment
class Coffee

fun orderCoffee(payment: Payment?) = Coffee()

// --------------------------------------------------------------------
// Listing 6.13 - Maybe providing a payment for coffee... or maybe not!
// --------------------------------------------------------------------

fun main() {
    val payment: Payment? = Payment() // or you could set this to null
    val coffee = orderCoffee(payment)
}
