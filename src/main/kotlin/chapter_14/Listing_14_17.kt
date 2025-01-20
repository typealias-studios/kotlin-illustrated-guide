package listing_14_17

abstract class Car(private val acceleration: Double = 1.0) {
    private var speed = 0.0
    protected open fun makeEngineSound() = println("Vrrrrrr...")

    fun accelerate() {
        speed += acceleration
        makeEngineSound()
    }
}

class SimpleCar(acceleration: Double) : Car(acceleration)

// ----------------------------------------------------------------------
// Listing 14.17 - Error: Cannot create an instance of an abstract class.
// ----------------------------------------------------------------------

fun main() {
    // val myCar = Car()
}
