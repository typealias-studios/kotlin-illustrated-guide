package listing_15_41

// ---------------------------------------------------------------------------------------------------
// Listing 15.41 - Error: Data class primary constructor must only have property (val/var) parameters.
// ---------------------------------------------------------------------------------------------------

open class Product(val id: String)

// data class Book(id: String, val title: String) : Product(id)
