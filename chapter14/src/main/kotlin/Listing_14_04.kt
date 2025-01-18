package listing_14_04

abstract class Car(private val acceleration: Double = 1.0) {
    private var speed = 0.0
    private fun makeEngineSound() = println("Vrrrrrr...")

    fun accelerate() {
        speed += acceleration
        makeEngineSound()
    }
}

// --------------------------------------------------------------------------------
// Listing 14.4 - Instantiating a `Car` class with a literal for the acceleration. 
// --------------------------------------------------------------------------------

class Clunker : Car(0.25)
