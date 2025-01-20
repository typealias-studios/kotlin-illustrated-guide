package listing_06_12

class Payment
class Coffee

fun orderCoffee(payment: Payment?) = Coffee()

// -------------------------------------------------------------------
// Listing 6.12 - Providing payment for a coffee at the coffee charity
// -------------------------------------------------------------------

fun main() {
    val payment: Payment = Payment()
    val coffee = orderCoffee(payment)
}
