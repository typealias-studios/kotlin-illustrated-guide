val pi = 3.14
var radius = 5.2

// -----------------------------------------------------------------------------------------------------------------------------
// Listing 2.5 - When you call a function, it's almost like you're substituting the function call with the body of the function.
// -----------------------------------------------------------------------------------------------------------------------------

fun circumference(radius: Double) = 2 * pi * radius

val circumferenceOfSmallCircle = 2 * pi * radius
