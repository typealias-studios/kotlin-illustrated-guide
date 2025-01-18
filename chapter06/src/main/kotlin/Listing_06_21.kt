package listing_06_21

class Payment
class Coffee

fun orderCoffee(payment: Payment?) = Coffee()
fun getPaymentFromFriend() = Payment()

// --------------------------------------------------------------------------------------------------------
// Listing 6.21 - If we don't have payment (that is, if `payment` is null), we get it from a friend instead
// --------------------------------------------------------------------------------------------------------

fun main() {
    val payment: Payment? = null
    
    if (payment != null) {
        val coffee = orderCoffee(payment)
    } else {
        val coffee = orderCoffee(getPaymentFromFriend())
    }
}
