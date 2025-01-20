package listing_14_20

open class Car(private val acceleration: Double = 1.0) {
    private var speed = 0.0
    protected open fun makeEngineSound() = println("Vrrrrrr...")

    fun accelerate() {
        speed += acceleration
        makeEngineSound()
    }
}

// ------------------------------------------------------------------------------------------------------
// Listing 14.20 - Error: Cannot access 'speed': it is invisible (private in a supertype) in `MuscleCar`.
// ------------------------------------------------------------------------------------------------------

class MuscleCar : Car(5.0) {
    override fun makeEngineSound() = when {
        // speed < 10.0 -> println("Vrooooom")
        // speed < 20.0 -> println("Vrooooooooom")
        else -> println("Vrooooooooooooooooooom!")
    }
}
