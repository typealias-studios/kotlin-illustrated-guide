package listing_10_21

// ---------------------------------------------------------------
// Listing 10.21 - Omitting `this.` inside the extension property.
// ---------------------------------------------------------------

val String.isLong: Boolean
    get() = length > 20
