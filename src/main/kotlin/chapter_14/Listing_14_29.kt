package listing_14_29

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

// ----------------------------------------------------------------------------------
// Listing 14.29 - Updating `Clunker` so that it is both a subclass and a superclass.
// ----------------------------------------------------------------------------------

open class Clunker(acceleration: Double) : Car(acceleration) {
    override fun makeEngineSound() = println("putt-putt-putt")
}

class Junker : Clunker(0.0)
