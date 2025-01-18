package listing_06_23

class Payment
class Coffee

fun orderCoffee(payment: Payment?) = Coffee()
fun getPaymentFromFriend() = Payment()

// -----------------------------------------------------------------------------------------------------
// Listing 6.23 - Lifting the call to `orderCoffee()` outside of the `if` body. Compare to Listing 6.22.
// -----------------------------------------------------------------------------------------------------

fun main() {
    val payment: Payment? = null

    val coffee =
        orderCoffee(if (payment != null) payment else getPaymentFromFriend())
}
