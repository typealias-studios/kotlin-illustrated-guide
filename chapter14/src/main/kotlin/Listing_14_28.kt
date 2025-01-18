package listing_14_28

open class Car(private val acceleration: Double = 1.0) {
    protected var speed = 0.0; private set
    protected open fun makeEngineSound() = println("Vrrrrrr...")

    fun accelerate() {
        speed += acceleration
        makeEngineSound()
    }
}

class MuscleCar : Car(5.0) {
    override fun makeEngineSound() = when {
        speed < 10.0 -> println("Vrooooom")
        speed < 20.0 -> println("Vrooooooooom")
        else         -> println("Vrooooooooooooooooooom!")
    }
}

// --------------------------------------------------------------------------------------
// Listing 14.28 - Sending a `MuscleCar` object to a function that has a `Car` parameter.
// --------------------------------------------------------------------------------------

fun main() {
    fun drive(car: Car) {
        // ...
    }

    drive(MuscleCar())
}
