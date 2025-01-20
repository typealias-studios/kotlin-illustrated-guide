package listing_14_03

// -----------------------------------------------------------------------------------------------
// Listing 14.3 - Adding an `acceleration` property to the `Car` class as a constructor parameter.
// -----------------------------------------------------------------------------------------------

abstract class Car(private val acceleration: Double = 1.0) {
    private var speed = 0.0
    private fun makeEngineSound() = println("Vrrrrrr...")

    fun accelerate() {
        speed += acceleration
        makeEngineSound()
    }
}
