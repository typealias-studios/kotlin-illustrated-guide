fun speed(distance: Double, time: Double = 2.0) = distance / time

// ----------------------------------------------------------
// Listing 2.16 - Calling a function with a default argument.
// ----------------------------------------------------------

val walkingSpeed = speed(10.2)
val bikingSpeed = speed(29.6)
val drivingSpeed = speed(225.3)
val flyingSpeed = speed(1368.747, 1.5)
