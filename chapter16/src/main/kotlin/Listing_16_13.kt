package listing_16_13

enum class Size { CUP, BUCKET, BAG }

val size = Size.CUP

// --------------------------------------------------------------------------------------------------------------------------
// Listing 16.13 - Error: “when expression must be exhaustive, add necessary BUCKET branch or else branch” (does not compile)
// --------------------------------------------------------------------------------------------------------------------------

fun main() {
    // when (size) {
    //     Size.CUP    -> println("A 12-ounce cup of ice")
    //     Size.BAG    -> println("A bag with 1 gallon of ice")
    // }
}
