package listing_14_09

// -----------------------------------------------------------------------------------------------------------------------------------
// Listing 14.9 - Adding the `protected` visibility modifier to the `makeEngineSound()` function, so that it is visible to subclasses.
// -----------------------------------------------------------------------------------------------------------------------------------

abstract class Car(private val acceleration: Double = 1.0) {
    private var speed = 0.0
    protected fun makeEngineSound() = println("Vrrrrrr...")

    fun accelerate() {
        speed += acceleration
        makeEngineSound()
    }
}
