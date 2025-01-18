package listing_17_04

val ordinals = listOf("zeroth", "first", "second", "third", "fourth", "fifth")
fun ordinal(number: Int) = ordinals.get(number)

fun annc(number: Int, task: String): String {
    val ordinal = ordinal(number)
    return "The $ordinal thing I will do is $task."
}

// --------------------------------------------
// Listing 17.4 - Adding a call to `println()`.
// --------------------------------------------

fun main() {
    val first = annc(1, "clean my room")
    println(first)
}
