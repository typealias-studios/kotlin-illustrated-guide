package listing_17_19

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

// -----------------------------------------------------------
// Listing 17.19 - Catching a broad exception type at the top.
// -----------------------------------------------------------

fun main() {
    try {
        println(annc(number, task))
    } catch (e: Exception) {
        println("I wasn't expecting this!")
    } catch (e: HolidayException) {
        println("It's a holiday! I'm not going to ${e.task} today!")
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("I can't count that high!")
    }
}
