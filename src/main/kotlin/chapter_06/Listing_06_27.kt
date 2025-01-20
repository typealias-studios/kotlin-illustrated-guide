package listing_06_27

// ---------------------------------------------------------------------
// Listing 6.27 - Adding a `PaymentType` property to the `Payment` class
// ---------------------------------------------------------------------

enum class PaymentType {
    CASH, CHECK, CARD;
}

class Payment(
    val type: PaymentType = PaymentType.CASH
)
