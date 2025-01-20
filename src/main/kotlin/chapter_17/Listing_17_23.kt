package listing_17_23

class Faucet {
    fun turnOn() = Unit
    fun turnOff() = Unit
}

class Sprinkler
class SprinklerBrokenException : Exception("The sprinkler is broken!")
class Store {
    fun orderNewSprinkler() = Unit
}

val faucet = Faucet()
val sprinkler = Sprinkler()
val store = Store()

fun watch(any: Any) {
    throw SprinklerBrokenException()
}

// -----------------------------------------------------------------------------------------------
// Listing 17.23 - If an exception is thrown in `watch()`, then `faucet.turnOff()` will never run.
// -----------------------------------------------------------------------------------------------

fun main() {
    try {
        faucet.turnOn()
        watch(sprinkler) // SprinklerBrokenException is thrown here
        faucet.turnOff() // This never runs!
    } catch (e: SprinklerBrokenException) {
        store.orderNewSprinkler()
    }
}
