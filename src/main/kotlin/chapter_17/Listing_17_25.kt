package listing_17_25

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

// --------------------------------------------------------------------------
// Listing 17.25 - Using `finally` without `catch`, for guaranteed execution.
// --------------------------------------------------------------------------

fun main() {
    try {
        faucet.turnOn()
        watch(sprinkler)
    } finally {
        faucet.turnOff()
    }
}
