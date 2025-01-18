package listing_10_08

// -------------------------------------------------------------------
// Listing 10.8 - A simple `Dog` class, with code telling it to speak.
// -------------------------------------------------------------------

fun main() {
    class Dog {
        fun speak() {
            println("BARK!")
        }
    }
    
    val fido = Dog()
    fido.speak()
}
