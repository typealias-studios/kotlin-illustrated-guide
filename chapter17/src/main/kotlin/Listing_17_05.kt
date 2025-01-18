package listing_17_05

val ordinals = listOf("zeroth", "first", "second", "third", "fourth", "fifth")
fun ordinal(number: Int) = ordinals.get(number)

fun annc(number: Int, task: String): String {
    val ordinal = ordinal(number)
    return "The $ordinal thing I will do is $task."
}

// -------------------------------------------------------------------
// Listing 17.5 - Triggering an exception with an out-of-bounds index.
// -------------------------------------------------------------------

fun main() {
    val task = annc(9, "clean my room")
    println(task)
}
