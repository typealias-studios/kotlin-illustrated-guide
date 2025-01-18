fun speed(distance: Double, time: Double = 2.0) = distance / time

// ------------------------------------------------------------------------------------------------------------------------------
// Listing 2.17 - Calling a function with the same argument value. The `distance` is `42.195` for the first three function calls.
// ------------------------------------------------------------------------------------------------------------------------------

val walkingSpeed = speed(42.195, 8.27)
val bikingSpeed = speed(42.195, 2.85)
val drivingSpeed = speed(42.195, 0.37)
val flyingSpeed = speed(0.12, 0.01)
