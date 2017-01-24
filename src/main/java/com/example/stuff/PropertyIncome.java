package com.example.stuff;

public class PropertyIncome {
    Money estimatedGrossRentalIncome;

    public PropertyIncome(Money estimatedGrossRentalIncome) {
        this.estimatedGrossRentalIncome = estimatedGrossRentalIncome;
    }

    public Money getEstimatedGrossRentalIncome() {
        return this.estimatedGrossRentalIncome;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof PropertyIncome)) return false;
        final PropertyIncome other = (PropertyIncome) o;
        final Object this$estimatedGrossRentalIncome = this.getEstimatedGrossRentalIncome();
        final Object other$estimatedGrossRentalIncome = other.getEstimatedGrossRentalIncome();
        if (this$estimatedGrossRentalIncome == null ? other$estimatedGrossRentalIncome != null : !this$estimatedGrossRentalIncome.equals(
                other$estimatedGrossRentalIncome)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $estimatedGrossRentalIncome = this.getEstimatedGrossRentalIncome();
        result = result * PRIME + ($estimatedGrossRentalIncome == null ? 43 : $estimatedGrossRentalIncome.hashCode());
        return result;
    }

    public String toString() {
        return "com.company.loanapp.common.property.valueObjects.PropertyIncome(estimatedGrossRentalIncome=" + this.getEstimatedGrossRentalIncome() + ")";
    }
}
