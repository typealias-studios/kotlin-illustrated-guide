package listing_17_01

// ----------------------------------------------------------------------------------------------
// Listing 17.1 - This code includes a potential problem that cannot be detected at compile time.
// ----------------------------------------------------------------------------------------------

val ordinals = listOf("zeroth", "first", "second", "third", "fourth", "fifth")
fun ordinal(number: Int) = ordinals.get(number)
