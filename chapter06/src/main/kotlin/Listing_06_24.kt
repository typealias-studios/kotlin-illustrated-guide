package listing_06_24

class Payment
class Coffee

fun orderCoffee(payment: Payment?) = Coffee()
fun getPaymentFromFriend() = Payment()
// ---------------------------------------------------------------------
// Listing 6.24 - Replacing the `if` expression with an elvis expression
// ---------------------------------------------------------------------

fun main() {
    val payment: Payment? = null
    
    val coffee = 
        orderCoffee(payment ?: getPaymentFromFriend())
}
