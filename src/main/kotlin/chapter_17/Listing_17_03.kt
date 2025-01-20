package listing_17_03

// -----------------------------------------------------------------
// Listing 17.3 - One function calls another, which calls another...
// -----------------------------------------------------------------

val ordinals = listOf("zeroth", "first", "second", "third", "fourth", "fifth")
fun ordinal(number: Int) = ordinals.get(number)

fun annc(number: Int, task: String): String {
    val ordinal = ordinal(number)
    return "The $ordinal thing I will do is $task."
}

fun main() {
    val first = annc(1, "clean my room")
    // "The first thing I will do is clean my room."
}
