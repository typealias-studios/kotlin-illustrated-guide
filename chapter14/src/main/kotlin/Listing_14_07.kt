package listing_14_07

abstract class Car(private val acceleration: Double = 1.0) {
    private var speed = 0.0
    private fun makeEngineSound() = println("Vrrrrrr...")

    fun accelerate() {
        speed += acceleration
        makeEngineSound()
    }
}

// -----------------------------------------------------------------------------------------------------------------------------------
// Listing 14.7 - Error: makeEngineSound defined in Clunker has no access to makeEngineSound defined in Car, so it cannot override it.
// -----------------------------------------------------------------------------------------------------------------------------------

class Clunker(acceleration: Double) : Car(acceleration) {
    // override fun makeEngineSound() = println("putt-putt-putt")
}
