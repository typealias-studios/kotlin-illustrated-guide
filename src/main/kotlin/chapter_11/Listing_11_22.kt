package listing_11_22

class Person(val name: String) {
    fun sayHello() = println("Hello!")
}

class Dog(val name: String) {
    fun bark() = println("Ruff!")
}

val person = Person("Julia")
val dog = Dog("Sparky")

// --------------------------------------------------------------------------------------------------------------------------------
// Listing 11.22 - Invoking a function on the `person` implicit receiver from a scope where `dog` is the primary implicit receiver.
// --------------------------------------------------------------------------------------------------------------------------------

fun main() {
    with(person) {
        with(dog) {
            println(name) // Prints Sparky from the dog object
            bark()        // Calls bark() on the dog object
            sayHello()    // Calls sayHello() on the person object
        }
    }
}
