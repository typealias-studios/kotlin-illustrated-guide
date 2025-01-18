fun speed(distance: Double, time: Double) = distance / time

// ----------------------------------------------------------------------------
// Listing 2.13 - Multiple ways to call a function with the same two arguments.
// ----------------------------------------------------------------------------

val averageSpeed1 = speed(321.8, 4.15)
val averageSpeed2 = speed(distance = 321.8, 4.15)
val averageSpeed3 = speed(321.8, time = 4.15)
val averageSpeed4 = speed(distance = 321.8, time = 4.15)
val averageSpeed5 = speed(time = 4.15, distance = 321.8)
