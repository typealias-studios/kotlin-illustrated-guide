package listing_17_06

val ordinals = listOf("zeroth", "first", "second", "third", "fourth", "fifth")
fun ordinal(number: Int) = ordinals.get(number)

fun annc(number: Int, task: String): String {
    val ordinal = ordinal(number)
    return "The $ordinal thing I will do is $task."
}

// ----------------------------------------------
// Listing 17.6 - Printing out each announcement.
// ----------------------------------------------

fun main() {
    val tasks = listOf(1 to "clean my room", 9 to "take out trash", 5 to "feed the dog")
    tasks.forEach { (number, task) ->
        println(annc(number, task))
    }
}
