package listing_10_19

fun String?.singleQuoted() =
    if (this == null) "(no value)" else "'$this'"

// -----------------------------------------------------------------------------------------------------------
// Listing 10.19 - Calling an extension function that has a nullable receiver type using a safe-call operator.
// -----------------------------------------------------------------------------------------------------------

fun main() {
    val title: String? = null
    val newTitle = title?.singleQuoted()
    
    println(newTitle) // null
}
