package listing_15_38

// -------------------------------------------------------------------
// Listing 15.38 - Adding componentN() functions to the `Child` class.
// -------------------------------------------------------------------

class Child(val name: String, val age: Int) {
    operator fun component1() = name
    operator fun component2() = age
}
