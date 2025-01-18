package listing_17_02

val ordinals = listOf("zeroth", "first", "second", "third", "fourth", "fifth")
fun ordinal(number: Int) = ordinals.get(number)

// ----------------------------------------------
// Listing 17.2 - Passing an out-of-bounds index.
// ----------------------------------------------

fun main() {
    val place = ordinal(9)
}
