package listing_14_14

// ------------------------------------------------------------------------------------------------------------------------------------------
// Listing 14.14 - Changing the `makeEngineSound()` function from `abstract` to `open`, which involves adding the body to the function again.
// ------------------------------------------------------------------------------------------------------------------------------------------

abstract class Car(private val acceleration: Double = 1.0) {
    private var speed = 0.0
    protected open fun makeEngineSound() = println("Vrrrrrr...")

    fun accelerate() {
        speed += acceleration
        makeEngineSound()
    }
}
