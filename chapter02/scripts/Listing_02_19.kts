fun speed(distance: Double = 42.195, time: Double) = distance / time

// -----------------------------------------------------------------------------
// Listing 2.19 - Error: No value passed for parameter 'time' (does not compile)
// -----------------------------------------------------------------------------

// val walkingSpeed = speed(8.27)
// val bikingSpeed = speed(2.85)
// val drivingSpeed = speed(0.37)
val flyingSpeed = speed(0.12, 0.01)
