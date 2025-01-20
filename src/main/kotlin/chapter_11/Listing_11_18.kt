package listing_11_18

class DropTargetListener

class DropTarget {
    fun addDropTargetListener(listener: DropTargetListener) = Unit
}

val myListener = DropTargetListener()

// -------------------------------------------------------------------------------
// Listing 11.18 - Using `apply()` to initialize a `DropTarget` immediately
// after constructing it. It's constructed and initialized in a single expression.
// -------------------------------------------------------------------------------

fun main() {
    val dropTarget = DropTarget().apply { 
        addDropTargetListener(myListener) 
    }
}
