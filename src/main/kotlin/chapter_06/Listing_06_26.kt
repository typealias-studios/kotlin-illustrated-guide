package listing_06_26

class Payment
class Coffee

fun orderCoffee(payment: Payment?) = Coffee()
fun getPaymentFromFriend() = Payment()

// -------------------------------------------------------------------------
// Listing 6.26 - You can run this code, but you'll get an error when you do
// -------------------------------------------------------------------------

fun main() {
    val payment: Payment? = null
    val coffee = orderCoffee(payment!!) // Error: KotlinNullPointerException
}
