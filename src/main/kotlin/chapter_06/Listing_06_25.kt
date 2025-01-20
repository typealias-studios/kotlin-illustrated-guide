package listing_06_25

class Payment
class Coffee

fun orderCoffee(payment: Payment?) = Coffee()

// ----------------------------------------------------------------------------------------------------------------------
// Listing 6.25 - Using the not-null assertion operator to force a conversion from a nullable type to a non-nullable type
// ----------------------------------------------------------------------------------------------------------------------

fun main() {
    val payment: Payment? = Payment()
    val coffee = orderCoffee(payment!!)
}
