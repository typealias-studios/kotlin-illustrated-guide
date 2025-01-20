@file:Suppress("UNNECESSARY_SAFE_CALL")

package listing_11_25

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

// ----------------------------------------------------------------------------------------------
// Listing 11.25 - Using a scope function to call `orderCoffee()` only when `payment` is present.
// ----------------------------------------------------------------------------------------------

fun main() {
    payment?.let { orderCoffee(it) }
}
