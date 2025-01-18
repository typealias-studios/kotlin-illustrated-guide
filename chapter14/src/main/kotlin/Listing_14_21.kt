package listing_14_21

// ------------------------------------------------------------------------------------------------------------
// Listing 14.21 - The `private` visibility modifier here prevents subclasses from seeing the `speed` property.
// ------------------------------------------------------------------------------------------------------------

open class Car(private val acceleration: Double = 1.0) {
    private var speed = 0.0
    // ...
}
