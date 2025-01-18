package listing_10_20

// --------------------------------------------
// Listing 10.20 - A simple extension property.
// --------------------------------------------

val String.isLong: Boolean
    get() = this.length > 20
