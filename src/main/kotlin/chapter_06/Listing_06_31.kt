package listing_06_31

enum class PaymentType {
    CASH, CHECK, CARD;
}

class Payment(
    val type: PaymentType = PaymentType.CASH
)

class Coffee

// ----------------------------------------------------------------------------------------------
// Listing 6.31 - Using a safe-call operator and an elvis operator instead of an `if` conditional
// ----------------------------------------------------------------------------------------------

fun orderCoffee(payment: Payment?): Coffee {
    val supportType =
        payment?.type?.name?.lowercase() ?: "encouragement"
    println("Thank you for supporting us with your $supportType")
    return Coffee()
}
