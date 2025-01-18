package listing_14_01

// -------------------------------------------------
// Listing 14.1 - A simple class to represent a car.
// -------------------------------------------------

class Car {
    private var speed = 0.0
    private fun makeEngineSound() = println("Vrrrrrr...")

    fun accelerate() {
        speed += 1.0
        makeEngineSound()
    }
}
