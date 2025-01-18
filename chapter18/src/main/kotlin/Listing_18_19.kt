package listing_18_19

class Mug<T>(val beverage: T)

// ----------------------------------------------------------------------------
// Listing 18.19 - Stuffing a String, an Int, a Boolean, and a null into a mug.
// ----------------------------------------------------------------------------

fun main() {
    val mugOfString: Mug<String> = Mug("How did this get in the mug?")
    val mugOfInt: Mug<Int> = Mug(5)
    val mugOfBoolean: Mug<Boolean> = Mug(true)
    val mugOfEmptiness: Mug<Any?> = Mug(null)
}
