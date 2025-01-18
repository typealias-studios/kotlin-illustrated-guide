package listing_13_13

// ------------------------------------------------------------------------------------------------
// Listing 13.13 - Updating the `BarStaff` interface and `Bartender` class to receive a compliment.
// ------------------------------------------------------------------------------------------------

interface BarStaff {
    // fun prepareBeverage(name: String): Beverage?
    fun receiveCompliment(message: String)
}

class Bartender : BarStaff {
    // ... disregarding other properties and functions ...
    override fun receiveCompliment(message: String) =
        println("Bartender received a compliment: $message")
}
