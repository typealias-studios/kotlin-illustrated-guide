@file:Suppress("SENSELESS_COMPARISON")

package listing_11_26

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

// -----------------------------------------------------------------------
// Listing 11.26 - A simple `if`-`else` conditional that checks for nulls.
// -----------------------------------------------------------------------

fun main() {
    if (payment != null) {
        orderCoffee(payment)
    } else {
        println("I can't order coffee today")
    }
}
