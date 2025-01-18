package listing_17_24

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

// -----------------------------------------------------------------------------
// Listing 17.24 - The `finally` block ensures that `faucet.turnOff()` will run.
// -----------------------------------------------------------------------------

fun main() {
    try {
        faucet.turnOn()
        watch(sprinkler) // SprinklerBrokenException is thrown here
    } catch (e: SprinklerBrokenException) {
        store.orderNewSprinkler()
    } finally {
        faucet.turnOff() // This will run, even when the sprinkler breaks!
    }
}
