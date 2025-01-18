package listing_04_22

// ----------------------------------------------------------------------------
// Listing 4.22 - Getting a property and calling functions on a `String` object
// ----------------------------------------------------------------------------

fun main() {
    val greeting: String = "Welcome"
    
    val numberOfLettersInGreeting = greeting.length // Evaluates to 7
    val loudGreeting = greeting.uppercase()         // Evaluates to "WELCOME"
    val substring = greeting.drop(3)                // Evaluates to just "come"
}
