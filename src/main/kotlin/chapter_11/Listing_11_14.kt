package listing_11_14

// -----------------------------------------------------------------------------------------------------------
// Listing 11.14 - Single-quoting a title with the `let()` function, using the implicit `it` lambda parameter.
// -----------------------------------------------------------------------------------------------------------

fun main() {
    val title = "The Robots from Planet X3"
    val newTitle = title
        .removePrefix("The ")
        .let { "'$it'" }
        .uppercase()
    
    // 'ROBOTS FROM PLANET X3'
}
