package listing_10_10

// -----------------------------------------------------------------------------
// Listing 10.10 - Omitting `this.` when calling `speak()` from inside `play()`.
// -----------------------------------------------------------------------------

class Dog {
    fun speak() {
        println("BARK!")
    }

    fun play() {
        speak()
    }
}
