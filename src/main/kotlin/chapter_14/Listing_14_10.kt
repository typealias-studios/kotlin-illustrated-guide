package listing_14_10

abstract class Car(private val acceleration: Double = 1.0) {
    private var speed = 0.0
    protected fun makeEngineSound() = println("Vrrrrrr...")

    fun accelerate() {
        speed += acceleration
        makeEngineSound()
    }
}

// ------------------------------------------------------------------------------------
// Listing 14.10 - Error: 'makeEngineSound' in 'Car' is final and cannot be overridden.
// ------------------------------------------------------------------------------------

class Clunker(acceleration: Double) : Car(acceleration) {
    // override fun makeEngineSound() = println("putt-putt-putt")
}
