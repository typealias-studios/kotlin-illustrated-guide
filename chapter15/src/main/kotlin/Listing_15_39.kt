package listing_15_39

class Child(val name: String, val age: Int) {
    operator fun component1() = name
    operator fun component2() = age
}

// ----------------------------------------------
// Listing 15.39 - Destructuring `Child` objects.
// ----------------------------------------------

fun main() {
    val children = listOf(
        Child("Fiona", 5),
        Child("Jack", 7)
    )
    
    children.forEach { (name, age) -> 
        println("$name is $age years old.")
    }
}
