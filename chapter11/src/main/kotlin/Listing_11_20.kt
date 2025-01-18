package listing_11_20

class Person(val name: String) {
    fun sayHello() = println("Hello!")
}

class Dog(val name: String) {
    fun bark() = println("Ruff!")
}

val person = Person("Julia")
val dog = Dog("Sparky")

// ------------------------------------------------------------------------------------------
// Listing 11.20 - Shadowing the `person` implicit receiver with the `dog` implicit receiver.
// ------------------------------------------------------------------------------------------

fun main() {
    with(person) {
        with(dog) {
            println(name)
        }
    }
}
