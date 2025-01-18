package listing_14_19

open class Car(private val acceleration: Double = 1.0) {
    private var speed = 0.0
    protected open fun makeEngineSound() = println("Vrrrrrr...")

    fun accelerate() {
        speed += acceleration
        makeEngineSound()
    }
}

// -----------------------------------------------
// Listing 14.19 - Directly instantiating a `Car`.
// -----------------------------------------------

fun main() {
    val myCar = Car()
}
