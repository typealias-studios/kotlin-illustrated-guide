package listing_17_27

val ordinals = listOf("zeroth", "first", "second", "third", "fourth", "fifth")
fun ordinal(number: Int) = ordinals.get(number)

class HolidayException(val task: String) : Exception("'$task' is not allowed on holidays")

fun annc(number: Int, task: String): String {
    if ("clean" in task) throw HolidayException(task)

    val ordinal = ordinal(number)
    return "The $ordinal thing I will do is $task."
}

val number = 1
val task = "clean my room"

// ----------------------------------------------------------
// Listing 17.27 - Using `getOrDefault()` for default values.
// ----------------------------------------------------------

fun main() {
    val result = runCatching { annc(number, task) }
    val text = result.getOrDefault("Something went wrong!")
    println(text)
}
