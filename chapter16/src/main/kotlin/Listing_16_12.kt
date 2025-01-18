package listing_16_12

enum class Size { CUP, BUCKET, BAG }

val size = Size.CUP

// ------------------------------------------------
// Listing 16.12 - An exhaustive `when` conditional
// ------------------------------------------------

fun main() {
    when (size) {
        Size.CUP    -> println("A 12-ounce cup of ice")
        Size.BUCKET -> println("A bucket with 1 quart of ice")
        Size.BAG    -> println("A bag with 1 gallon of ice")
    }
}
