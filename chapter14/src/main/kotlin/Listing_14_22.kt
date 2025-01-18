package listing_14_22

// ----------------------------------------------------------------------------------------------
// Listing 14.22 - Changing the visibility of the `speed` property from `private` to `protected`.
// ----------------------------------------------------------------------------------------------

open class Car(private val acceleration: Double = 1.0) {
    protected var speed = 0.0
    // ...
}
