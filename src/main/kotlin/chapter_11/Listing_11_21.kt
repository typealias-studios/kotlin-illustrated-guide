package listing_11_21

class Person(val name: String) {
    fun sayHello() = println("Hello!")
}

class Dog(val name: String) {
    fun bark() = println("Ruff!")
}

val person = Person("Julia")
val dog = Dog("Sparky")

// ----------------------------------------------------------------------------------
// Listing 11.21 - Invoking a property and a function on the `dog` implicit receiver.
// ----------------------------------------------------------------------------------

fun main() {
    with(person) {
        with(dog) {
            println(name) // Prints Sparky from the dog object
            bark()        // Calls bark() on the dog object
        }
    }
}
