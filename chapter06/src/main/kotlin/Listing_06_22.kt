package listing_06_22

class Payment
class Coffee

fun orderCoffee(payment: Payment?) = Coffee()
fun getPaymentFromFriend() = Payment()

// ----------------------------------------------------------------------------------------------------
// Listing 6.22 - Lifting the assignment of `coffee` outside of the `if` body. Compare to Listing 6.21.
// ----------------------------------------------------------------------------------------------------

fun main() {
    val payment: Payment? = null
    
    val coffee = if (payment != null) {
        orderCoffee(payment)
    } else {
        orderCoffee(getPaymentFromFriend())
    }
}
