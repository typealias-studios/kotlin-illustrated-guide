package listing_14_12

abstract class Car(private val acceleration: Double = 1.0) {
    private var speed = 0.0
    protected abstract fun makeEngineSound() // no body allowed here!

    fun accelerate() {
        speed += acceleration
        makeEngineSound()
    }
}

// --------------------------------------------------------------------------------------
// Listing 14.12 - Overriding the `makeEngineSound()` function in the `Clunker` subclass.
// --------------------------------------------------------------------------------------

class Clunker(acceleration: Double) : Car(acceleration) {
    override fun makeEngineSound() = println("putt-putt-putt")
}
