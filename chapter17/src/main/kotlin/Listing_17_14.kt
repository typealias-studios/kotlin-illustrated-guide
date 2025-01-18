package listing_17_14

// --------------------------------------------------
// Listing 17.14 - Creating a custom exception class.
// --------------------------------------------------

class HolidayException(val task: String) : Exception("'$task' is not allowed on holidays")
