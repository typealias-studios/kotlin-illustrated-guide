package listing_17_08

val ordinals = listOf("zeroth", "first", "second", "third", "fourth", "fifth")
fun ordinal(number: Int) = ordinals.get(number)

fun annc(number: Int, task: String): String {
    val ordinal = ordinal(number)
    return "The $ordinal thing I will do is $task."
}

val number = 1
val task = "clean my room"

// ------------------------------------------------------------
// Listing 17.8 - Using a short variable name for an exception.
// ------------------------------------------------------------

fun main() {
    try {
        println(annc(number, task))
    } catch (e: Exception) {
        println("Something went wrong!")
    }
}
