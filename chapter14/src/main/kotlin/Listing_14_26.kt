package listing_14_26

open class Car(private val acceleration: Double = 1.0) {
    protected var speed = 0.0; private set
    protected open fun makeEngineSound() = println("Vrrrrrr...")

    fun accelerate() {
        speed += acceleration
        makeEngineSound()
    }
}

interface Named {
    val name: String get() = "No name"
}

// -------------------------------------------------------------------------------------------
// Listing 14.26 - Declaring that `NamedCar` both extends a class and implements an interface.
// -------------------------------------------------------------------------------------------

class NamedCar(override val name: String) : Car(3.0), Named
