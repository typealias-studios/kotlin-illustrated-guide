package listing_11_23

class Person(val name: String) {
    fun sayHello() = println("Hello!")
}

class Dog(val name: String) {
    fun bark() = println("Ruff!")
}

val person = Person("Julia")
val dog = Dog("Sparky")

// -----------------------------------------------------
// Listing 11.23 - Error: Unresolved reference: sayHello
// -----------------------------------------------------

fun main() {
    with(person) {
        with(dog) {
            println(this.name)    // Prints Sparky
            this.bark()           // Calls bark() on the dog object
            // this.sayHello()    // Compiler error - Unresolved reference: sayHello
        }
    }
}
