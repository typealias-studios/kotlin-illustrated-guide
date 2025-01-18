package listing_14_02

class Car {
    private var speed = 0.0
    private fun makeEngineSound() = println("Vrrrrrr...")

    fun accelerate() {
        speed += 1.0
        makeEngineSound()
    }
}

// -------------------------------------------------------------------------------------
// Listing 14.2 - Instantiating the `Car` class and calling its `accelerate()` function.
// -------------------------------------------------------------------------------------

fun main() {
    val myCar = Car()
    myCar.accelerate()
}
