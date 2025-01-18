package listing_06_30

enum class PaymentType {
    CASH, CHECK, CARD;
}

class Payment(
    val type: PaymentType = PaymentType.CASH
)

class Coffee

// ------------------------------------------------------------------------------------------
// Listing 6.30 - Using an `if` conditional to provide a `supportType` when `payment` is null
// ------------------------------------------------------------------------------------------

fun orderCoffee(payment: Payment?): Coffee {
    val supportType = if (payment == null) {
        "encouragement"
    } else {
        payment.type.name.lowercase()
    }

    println("Thank you for supporting us with your $supportType")
    return Coffee()
}
