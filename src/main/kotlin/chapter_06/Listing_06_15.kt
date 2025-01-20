package listing_06_15

class Payment
class Coffee

fun orderCoffee(payment: Payment?) = Coffee()

// --------------------------------------------------------------------
// Listing 6.15 - Providing payment for a coffee at the coffee business
// --------------------------------------------------------------------

fun main() {
    val payment: Payment = Payment()
    val coffee = orderCoffee(payment)
}
