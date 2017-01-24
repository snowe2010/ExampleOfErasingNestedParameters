package com.example

import java.util.*

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




//data class PropertyRegisteredEvent(
//        val id: String? = null,
//        var property: PropertyValueObject
//)

//data class PropertyValueObject(val propertyDetails: PropertyDetails? = null)

//data class PropertyDetails(
//        var yearBuilt: Int = 0,
//        var acreage: Float = 0.toFloat(),
//        var numberOfUnits: Int = 0
//)

data class FannieMaeFile(
        val loanId: UUID,
        val loanTransactionId: UUID,
        override var tenantId: UUID,
        var loanApplication: APPLICATION
) : AbstractView {

    companion object {
        @JvmStatic
        fun builder(): Builder = Builder()
    }

    class Builder {

        private lateinit var loanId: UUID
        private lateinit var loanTransactionId: UUID
        private lateinit var tenantId: UUID
        private var loanApplication: APPLICATION = APPLICATION()

        fun copyOf(fannieMaeFile: FannieMaeFile): Builder {
            this.loanId = fannieMaeFile.loanId
            this.loanTransactionId = fannieMaeFile.loanTransactionId
            this.tenantId = fannieMaeFile.tenantId
            this.loanApplication = fannieMaeFile.loanApplication
            return this
        }

        fun loanId(loanId: UUID) = apply { this.loanId = loanId }
        fun loanTransactionId(loanTransactionId: UUID) =
                apply { this.loanTransactionId = loanTransactionId }

        fun tenantId(tenantId: UUID) = apply { this.tenantId = tenantId }
        fun loanApplication(loanApplication: APPLICATION) = apply { this.loanApplication = loanApplication }

        fun build() = FannieMaeFile(loanId, loanTransactionId, tenantId, loanApplication)

    }

}

interface AbstractView {
    var tenantId: UUID
}

