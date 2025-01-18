package listing_10_09

// -------------------------------------------------------------
// Listing 10.9 - Adding a `play()` function to the `Dog` class.
// -------------------------------------------------------------

class Dog {
    fun speak() {
        println("BARK!")
    }

    fun play() {
        this.speak()
    }
}
