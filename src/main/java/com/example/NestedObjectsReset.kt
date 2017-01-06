package com.example

/**
 * @author tylerthrailkill
 */

data class Truck(
        var wheel: Wheel? = null
)

data class Car(
        var wheel: Wheel? = null
)

data class Wheel(
        var bolt: Bolt? = null,
        var tire: Tire? = null
)

data class Bolt(var size: Int? = null, var type: String? = null)
data class Tire(var size: Int? = null, var type: String? = null)
