package listing_14_15

abstract class Car(private val acceleration: Double = 1.0) {
    private var speed = 0.0
    protected open fun makeEngineSound() = println("Vrrrrrr...")

    fun accelerate() {
        speed += acceleration
        makeEngineSound()
    }
}

// --------------------------------------------------------------------------------------------
// Listing 14.15 - A subclass of `Car` that does not override the `makeEngineSound()` function.
// --------------------------------------------------------------------------------------------

class SimpleCar(acceleration: Double) : Car(acceleration)
