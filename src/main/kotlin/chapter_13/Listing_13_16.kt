package listing_13_16

// -------------------------------------------------------------------
// Listing 13.16 - Three farm animals, all eating something different.
// -------------------------------------------------------------------

fun main() {
    class Cow {
        fun eat() = println("Eating grass - munch, munch, munch!")
    }
    
    class Chicken {
        fun eat() = println("Eating bugs - munch, munch, munch!")
    }
    
    class Pig {
        fun eat() = println("Eating corn - munch, munch, munch!")
    }
    
    Cow().eat()     // Eating grass - munch, munch, munch!
    Chicken().eat() // Eating bugs - munch, munch, munch!
    Pig().eat()     // Eating corn - munch, munch, munch!
}
