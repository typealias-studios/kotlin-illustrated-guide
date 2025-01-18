fun speed(distance: Double, time: Double) = distance / time

// -----------------------------------------------------------------------------------------------------------------------
// Listing 2.14 - Calling a function with the same argument value. The `time` is `2.0` for the first three function calls.
// -----------------------------------------------------------------------------------------------------------------------

val walkingSpeed = speed(10.2, 2.0)
val bikingSpeed = speed(29.6, 2.0)
val drivingSpeed = speed(225.3, 2.0)
val flyingSpeed = speed(1368.747, 1.5)
