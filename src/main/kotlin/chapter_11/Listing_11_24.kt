@file:Suppress("SENSELESS_COMPARISON")

package listing_11_24

enum class PaymentType { CASH, CHECK, CARD; }
class Payment(val type: PaymentType = PaymentType.CASH)
class Coffee

fun orderCoffee(payment: Payment?): Coffee {
    val supportType =
        payment?.type?.name?.lowercase() ?: "encouragement"
    println("Thank you for supporting us with your $supportType")
    return Coffee()
}

val payment = Payment()

// --------------------------------------------------------------------------------------------------------------------------
// Listing 11.24 - Using a conditional to call `orderCoffee()` only when `payment` is present, roughly copied from Chapter 6.
// --------------------------------------------------------------------------------------------------------------------------

fun main() {
    if (payment != null) {
        orderCoffee(payment)
    }
}
