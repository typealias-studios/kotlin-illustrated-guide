fun speed(distance: Double = 42.195, time: Double) = distance / time

// ------------------------------------------------------------------------------------
// Listing 2.20 - Accepting the default argument for the first parameter of a function.
// ------------------------------------------------------------------------------------

val walkingSpeed = speed(time = 8.27)
val bikingSpeed = speed(time = 2.85)
val drivingSpeed = speed(time = 0.37)
val flyingSpeed = speed(0.12, 0.01)
