package listing_14_13

abstract class Car(private val acceleration: Double = 1.0) {
    private var speed = 0.0
    protected abstract fun makeEngineSound() // no body allowed here!

    fun accelerate() {
        speed += acceleration
        makeEngineSound()
    }
}

class Clunker(acceleration: Double) : Car(acceleration) {
    override fun makeEngineSound() = println("putt-putt-putt")
}

// -----------------------------------------------------------
// Listing 14.13 - Instantiating and accelerating a `Clunker`.
// -----------------------------------------------------------

fun main() {
    val clunker = Clunker(0.25)
    clunker.accelerate()
}
