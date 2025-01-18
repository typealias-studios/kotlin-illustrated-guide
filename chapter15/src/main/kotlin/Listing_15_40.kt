package listing_15_40

// ---------------------------------------------------------------------------------------
// Listing 15.40 - Using extension functions to enable a Double object to be destructured.
// ---------------------------------------------------------------------------------------

fun main() {
    operator fun Double.component1() = toString().split(".").first().toInt()
    operator fun Double.component2() = toString().split(".").last().toInt()
    
    val (integral, fractional) = 108.245
    println(integral)   // 108
    println(fractional) // 245
}
