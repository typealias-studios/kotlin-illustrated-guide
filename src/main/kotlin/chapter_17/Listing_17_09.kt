package listing_17_09

val ordinals = listOf("zeroth", "first", "second", "third", "fourth", "fifth")
fun ordinal(number: Int) = ordinals.get(number)

fun annc(number: Int, task: String): String {
    val ordinal = ordinal(number)
    return "The $ordinal thing I will do is $task."
}

val number = 1
val task = "clean my room"

// -------------------------------------------------------------
// Listing 17.9 - Including the exception message in the output.
// -------------------------------------------------------------

fun main() {
    try {
        println(annc(number, task)) 
    } catch (e: Exception) {
        println("Something went wrong! ${e.message}")
    }
}
