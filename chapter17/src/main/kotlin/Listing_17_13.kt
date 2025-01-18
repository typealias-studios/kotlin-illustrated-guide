package listing_17_13

val ordinals = listOf("zeroth", "first", "second", "third", "fourth", "fifth")
fun ordinal(number: Int) = ordinals.get(number)

// ----------------------------------------------------------
// Listing 17.13 - Adding a `throw` to our `annc()` function.
// ----------------------------------------------------------

fun annc(number: Int, task: String): String {
    if ("clean" in task) throw Exception("No cleaning allowed on holidays!")
    val ordinal = ordinal(number)
    return "The $ordinal thing I will do is $task."
}
