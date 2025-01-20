package listing_15_01

// ---------------------------------------------------------------------------------------------------------------
// Listing 15.1 - Two variables are not considered equal, even though their objects have the same property values.
// ---------------------------------------------------------------------------------------------------------------

fun main() {
    class Child(val name: String)
    
    val fiona1 = Child("Fiona")
    val fiona2 = Child("Fiona")
    
    println(fiona1 == fiona2) // false
}
