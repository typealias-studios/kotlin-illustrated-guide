package listing_14_11

// -------------------------------------------------------------------------------------------------------------------
// Listing 14.11 - Adding an `abstract` modifier to the `makeEngineSound()` function, and removing its implementation.
// -------------------------------------------------------------------------------------------------------------------

abstract class Car(private val acceleration: Double = 1.0) {
    private var speed = 0.0
    protected abstract fun makeEngineSound() // no body allowed here!

    fun accelerate() {
        speed += acceleration
        makeEngineSound()
    }
}
