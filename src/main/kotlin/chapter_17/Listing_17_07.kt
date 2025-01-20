package listing_17_07

val ordinals = listOf("zeroth", "first", "second", "third", "fourth", "fifth")
fun ordinal(number: Int) = ordinals.get(number)

fun annc(number: Int, task: String): String {
    val ordinal = ordinal(number)
    return "The $ordinal thing I will do is $task."
}

// --------------------------------------------------------------------------------
// Listing 17.7 - Catching an exception and printing out that something went wrong.
// --------------------------------------------------------------------------------

fun main() {
    val tasks = listOf(1 to "clean my room", 9 to "take out trash", 3 to "feed the dog")
    tasks.forEach { (number, task) ->
        try {
            println(annc(number, task))
        } catch (exception: Exception) {
            println("Something went wrong!")
        }
    }
}
