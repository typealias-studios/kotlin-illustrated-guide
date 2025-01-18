package listing_10_18

fun String?.singleQuoted() =
    if (this == null) "(no value)" else "'$this'"

// ------------------------------------------------------------------------------------------------------------
// Listing 10.18 - Calling an extension function that has a nullable receiver type using a normal dot operator.
// ------------------------------------------------------------------------------------------------------------

fun main() {
    val title: String? = null
    val newTitle = title.singleQuoted()
    
    println(newTitle) // (no value)
}
