package listing_10_16

fun String.singleQuoted() = "'$this'"

// -----------------------------------------------------------------------
// Listing 10.16 - Using a safe-call operator when the object is nullable.
// -----------------------------------------------------------------------

fun main() {
    val title: String? = null
    val newTitle = title?.singleQuoted()
}
