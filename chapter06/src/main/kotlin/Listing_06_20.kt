@file:Suppress("SENSELESS_NULL_IN_WHEN")

package listing_06_20

class Payment
class Coffee

fun orderCoffee(payment: Payment?) = Coffee()
val payment = Payment()

// ----------------------------------------------------
// Listing 6.20 - Smart cast using a `when` conditional
// ----------------------------------------------------

fun main() {
    when (payment) {
        null -> println("I can't order coffee today")
        else -> orderCoffee(payment)
    }
}
