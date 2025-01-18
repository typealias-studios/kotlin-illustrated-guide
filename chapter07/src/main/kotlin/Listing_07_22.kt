package listing_07_22

// -------------------------------------------------------------------------------------
// Listing 7.22 - Code that includes a function literal instead of a function reference.
// -------------------------------------------------------------------------------------

val applyDiscount: (Double) -> Double = { price: Double -> price - 5.0 }
