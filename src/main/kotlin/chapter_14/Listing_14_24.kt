package listing_14_24

// --------------------------------------------------------------------------------------------------------------------
// Listing 14.24 - Making the visibility of the `speed` property `protected` on its getter and `private` on its setter.
// --------------------------------------------------------------------------------------------------------------------

open class Car(private val acceleration: Double = 1.0) {
    protected var speed = 0.0
        private set
    // ...
}
