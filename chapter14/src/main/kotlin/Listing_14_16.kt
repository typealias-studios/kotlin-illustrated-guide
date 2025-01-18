package listing_14_16

abstract class Car(private val acceleration: Double = 1.0) {
    private var speed = 0.0
    protected open fun makeEngineSound() = println("Vrrrrrr...")

    fun accelerate() {
        speed += acceleration
        makeEngineSound()
    }
}

class SimpleCar(acceleration: Double) : Car(acceleration)

// --------------------------------------------------------------------------------
// Listing 14.16 - Instantiating and calling `accelerate()` on a `SimpleCar` class.
// --------------------------------------------------------------------------------

fun main() {
    val car = SimpleCar(1.2)
    
    car.accelerate()
}
