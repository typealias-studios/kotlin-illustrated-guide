package listing_10_15

fun String.singleQuoted() = "'$this'"

// --------------------------------------------------------------------------------------------------------------------------
// Listing 10.15 - Error: "Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String"
// --------------------------------------------------------------------------------------------------------------------------

fun main() {
    val title: String? = null
    // val newTitle = title.singleQuoted()
}
