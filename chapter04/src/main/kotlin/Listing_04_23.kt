package listing_04_23

// ------------------------------------------------------
// Listing 4.23 - Calling functions on a `Boolean` object
// ------------------------------------------------------

fun main() {
    val isDark: Boolean = true
    val isRaining: Boolean = false
    
    val shouldTurnOnHeadlights = isDark.or(isRaining)
    val shouldStayHome = isDark.and(isRaining)
}
