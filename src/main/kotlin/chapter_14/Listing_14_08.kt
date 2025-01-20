package listing_14_08

abstract class Car(private val acceleration: Double = 1.0) {
    private var speed = 0.0
    fun makeEngineSound() = println("Vrrrrrr...")

    fun accelerate() {
        speed += acceleration
        makeEngineSound()
    }
}

class Clunker(acceleration: Double) : Car(acceleration) {
    // fun makeEngineSound() = println("putt-putt-putt")
}

// --------------------------------------------------------------------------------------------------------
// Listing 14.8 - Bypassing the `accelerate()` function, calling the `makeEngineSound()` function directly.
// --------------------------------------------------------------------------------------------------------

fun main() {
    val car = Clunker(0.25)
    car.makeEngineSound()
}
