package listing_14_23

open class Car(private val acceleration: Double = 1.0) {
    protected var speed = 0.0
    protected open fun makeEngineSound() = println("Vrrrrrr...")

    fun accelerate() {
        speed += acceleration
        makeEngineSound()
    }
}

// -----------------------------------------------------------------------------------------------
// Listing 14.23 - Bypassing the `accelerate()` function by setting the value of `speed` directly.
// -----------------------------------------------------------------------------------------------

class Clunker(acceleration: Double) : Car(acceleration) {
    override fun makeEngineSound() {
        println("putt-putt-putt")
        speed = 999.0 // Yikes! Shouldn't be able to increase the
                      // speed without calling accelerate()!
    }
}
