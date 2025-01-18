package listing_06_29

enum class PaymentType {
    CASH, CHECK, CARD;
}

class Payment(
    val type: PaymentType = PaymentType.CASH
)

class Coffee

// -------------------------------------------------------------------------------------------------------------------------
// Listing 6.29 - Error: Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type Payment?
// -------------------------------------------------------------------------------------------------------------------------

fun main() {
    fun orderCoffee(payment: Payment?): Coffee {
        // val paymentType = payment.type.name.toLowerCase()
        // println("Thank you for supporting us with your $paymentType")
        return Coffee()
    }
}
