@file:Suppress("UNNECESSARY_SAFE_CALL", "USELESS_ELVIS")

package listing_11_27

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

// ---------------------------------------------------------------------------------------------------
// Listing 11.27 - Rewriting the `if`-`else` null-check conditional so that it uses a scope function. 
// ---------------------------------------------------------------------------------------------------

fun main() {
    payment?.let { orderCoffee(it) } ?: println("I can't order coffee today")
}
