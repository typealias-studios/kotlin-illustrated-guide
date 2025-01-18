package listing_11_19

// ----------------------------------------------------------------------------------------------------------------
// Listing 11.19 - Two classes, and two objects, which will be used to demonstrate shadowing of implicit receivers.
// ----------------------------------------------------------------------------------------------------------------

class Person(val name: String) {
    fun sayHello() = println("Hello!")
}

class Dog(val name: String) {
    fun bark() = println("Ruff!")
}

val person = Person("Julia")
val dog = Dog("Sparky")
