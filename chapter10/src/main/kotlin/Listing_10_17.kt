package listing_10_17

// ----------------------------------------------------------------------------
// Listing 10.17 - Creating an extension function for a nullable receiver type.
// ----------------------------------------------------------------------------

fun String?.singleQuoted() =
    if (this == null) "(no value)" else "'$this'"
