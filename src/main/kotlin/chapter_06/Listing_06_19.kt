package listing_06_19

class Payment
class Coffee

fun orderCoffee(payment: Payment?) = Coffee()

// -------------------------------------------------------------------------
// Listing 6.19 - Using an `if` conditional to see whether `payment` is null
// -------------------------------------------------------------------------

fun main() {
    val payment: Payment? = Payment()
    
    if (payment != null) {
        val coffee = orderCoffee(payment)
    } else {
        println("I can't order coffee today")
    }
}
