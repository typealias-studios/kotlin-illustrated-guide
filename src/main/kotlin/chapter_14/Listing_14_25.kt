package listing_14_25

// -------------------------------------------------------------------------------------------------
// Listing 14.25 - Setting different visibility for a property's getter and setter on a single line.
// -------------------------------------------------------------------------------------------------

open class Car(private val acceleration: Double = 1.0) {
    protected var speed = 0.0; private set
    // ...
}
