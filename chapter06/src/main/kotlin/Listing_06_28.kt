package listing_06_28

enum class PaymentType {
    CASH, CHECK, CARD;
}

class Payment(
    val type: PaymentType = PaymentType.CASH
)

class Coffee

// -------------------------------------------------------------------
// Listing 6.28 - Printing a message based on the type of payment used
// -------------------------------------------------------------------

fun orderCoffee(payment: Payment): Coffee {
    val paymentType = payment.type.name.lowercase()
    println("Thank you for supporting us with your $paymentType")
    return Coffee()
}
