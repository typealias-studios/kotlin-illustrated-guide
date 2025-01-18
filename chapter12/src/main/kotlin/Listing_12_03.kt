package listing_12_03

// ------------------------------------
// Listing 12.3 - Adding a `Pig` class.
// ------------------------------------

class Pig(val name: String, val excitementLevel: Int) {
    fun speak() {
        repeat(excitementLevel) {
            println("Oink!")
        }
    }
}
