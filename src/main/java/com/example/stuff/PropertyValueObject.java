package com.example.stuff;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.example.PropertyDetails;

public class PropertyValueObject implements Serializable {
    private PropertyId propertyId;

    private LoanTransactionId loanTransactionId;

    private boolean subjectPropertyIndicator;

    private PostalAddress propertyAddress;

    private PropertyDetails propertyDetails;

    private PropertyIncome propertyIncome;

    private Set<ApplicantId> propertyOwners = new HashSet<>();

    private Set<ApplicantId> currentResidents = new HashSet<>();

    //Using a list instead of a set here to allow for duplicate names
    private List<String> propertyOwnerNames = new ArrayList<>();

    public PropertyValueObject(PropertyId propertyId,
                               LoanTransactionId loanTransactionId,
                               boolean subjectPropertyIndicator,
                               PostalAddress propertyAddress,
                               PropertyDetails propertyDetails, PropertyIncome propertyIncome) {
        this.propertyId = propertyId;
        this.loanTransactionId = loanTransactionId;
        this.subjectPropertyIndicator = subjectPropertyIndicator;
        this.propertyAddress = propertyAddress;
        this.propertyDetails = propertyDetails;
        this.propertyIncome = propertyIncome;
    }

    public static PropertyValueObjectBuilder builder() {
        return new PropertyValueObjectBuilder();
    }

    public PropertyId getPropertyId() {
        return this.propertyId;
    }

    public LoanTransactionId getLoanTransactionId() {
        return this.loanTransactionId;
    }

    public boolean isSubjectPropertyIndicator() {
        return this.subjectPropertyIndicator;
    }

    public PostalAddress getPropertyAddress() {
        return this.propertyAddress;
    }

    public PropertyDetails getPropertyDetails() {
        return this.propertyDetails;
    }

    public PropertyIncome getPropertyIncome() {
        return this.propertyIncome;
    }

    public Set<ApplicantId> getPropertyOwners() {
        return this.propertyOwners;
    }

    public Set<ApplicantId> getCurrentResidents() {
        return this.currentResidents;
    }

    public List<String> getPropertyOwnerNames() {
        return this.propertyOwnerNames;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof PropertyValueObject)) return false;
        final PropertyValueObject other = (PropertyValueObject) o;
        final Object this$propertyId = this.getPropertyId();
        final Object other$propertyId = other.getPropertyId();
        if (this$propertyId == null ? other$propertyId != null : !this$propertyId.equals(other$propertyId))
            return false;
        final Object this$loanTransactionId = this.getLoanTransactionId();
        final Object other$loanTransactionId = other.getLoanTransactionId();
        if (this$loanTransactionId == null ? other$loanTransactionId != null : !this$loanTransactionId.equals(
                other$loanTransactionId)) return false;
        if (this.isSubjectPropertyIndicator() != other.isSubjectPropertyIndicator()) return false;
        final Object this$propertyAddress = this.getPropertyAddress();
        final Object other$propertyAddress = other.getPropertyAddress();
        if (this$propertyAddress == null ? other$propertyAddress != null : !this$propertyAddress.equals(
                other$propertyAddress)) return false;
        final Object this$propertyDetails = this.getPropertyDetails();
        final Object other$propertyDetails = other.getPropertyDetails();
        if (this$propertyDetails == null ? other$propertyDetails != null : !this$propertyDetails.equals(
                other$propertyDetails)) return false;
        final Object this$propertyIncome = this.getPropertyIncome();
        final Object other$propertyIncome = other.getPropertyIncome();
        if (this$propertyIncome == null ? other$propertyIncome != null : !this$propertyIncome.equals(
                other$propertyIncome)) return false;
        final Object this$propertyOwners = this.getPropertyOwners();
        final Object other$propertyOwners = other.getPropertyOwners();
        if (this$propertyOwners == null ? other$propertyOwners != null : !this$propertyOwners.equals(
                other$propertyOwners)) return false;
        final Object this$currentResidents = this.getCurrentResidents();
        final Object other$currentResidents = other.getCurrentResidents();
        if (this$currentResidents == null ? other$currentResidents != null : !this$currentResidents.equals(
                other$currentResidents)) return false;
        final Object this$propertyOwnerNames = this.getPropertyOwnerNames();
        final Object other$propertyOwnerNames = other.getPropertyOwnerNames();
        if (this$propertyOwnerNames == null ? other$propertyOwnerNames != null : !this$propertyOwnerNames.equals(
                other$propertyOwnerNames)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $propertyId = this.getPropertyId();
        result = result * PRIME + ($propertyId == null ? 43 : $propertyId.hashCode());
        final Object $loanTransactionId = this.getLoanTransactionId();
        result = result * PRIME + ($loanTransactionId == null ? 43 : $loanTransactionId.hashCode());
        result = result * PRIME + (this.isSubjectPropertyIndicator() ? 79 : 97);
        final Object $propertyAddress = this.getPropertyAddress();
        result = result * PRIME + ($propertyAddress == null ? 43 : $propertyAddress.hashCode());
        final Object $propertyDetails = this.getPropertyDetails();
        result = result * PRIME + ($propertyDetails == null ? 43 : $propertyDetails.hashCode());
        final Object $propertyIncome = this.getPropertyIncome();
        result = result * PRIME + ($propertyIncome == null ? 43 : $propertyIncome.hashCode());
        final Object $propertyOwners = this.getPropertyOwners();
        result = result * PRIME + ($propertyOwners == null ? 43 : $propertyOwners.hashCode());
        final Object $currentResidents = this.getCurrentResidents();
        result = result * PRIME + ($currentResidents == null ? 43 : $currentResidents.hashCode());
        final Object $propertyOwnerNames = this.getPropertyOwnerNames();
        result = result * PRIME + ($propertyOwnerNames == null ? 43 : $propertyOwnerNames.hashCode());
        return result;
    }

    public String toString() {
        return "com.company.loanapp.common.property.valueObjects.PropertyValueObject(propertyId=" + this.getPropertyId() + ", loanTransactionId=" + this.getLoanTransactionId() + ", subjectPropertyIndicator=" + this.isSubjectPropertyIndicator() + ", propertyAddress=" + this.getPropertyAddress() + ", propertyDetails=" + this.getPropertyDetails() + ", propertyIncome=" + this.getPropertyIncome() + ", propertyOwners=" + this.getPropertyOwners() + ", currentResidents=" + this.getCurrentResidents() + ", propertyOwnerNames=" + this.getPropertyOwnerNames() + ")";
    }

    public PropertyValueObject withPropertyId(PropertyId propertyId) {
        return this.propertyId == propertyId ? this : new PropertyValueObject(propertyId,
                                                                              this.loanTransactionId,
                                                                              this.subjectPropertyIndicator,
                                                                              this.propertyAddress,
                                                                              this.propertyDetails,
                                                                              this.propertyIncome);
    }

    public PropertyValueObject withSubjectPropertyIndicator(boolean subjectPropertyIndicator) {
        return this.subjectPropertyIndicator == subjectPropertyIndicator ? this : new PropertyValueObject(this.propertyId,
                                                                                                          this.loanTransactionId,
                                                                                                          subjectPropertyIndicator,
                                                                                                          this.propertyAddress,
                                                                                                          this.propertyDetails,
                                                                                                          this.propertyIncome);
    }

    public static class PropertyValueObjectBuilder {
        private PropertyId propertyId;
        private LoanTransactionId loanTransactionId;
        private boolean subjectPropertyIndicator;
        private PostalAddress propertyAddress;
        private PropertyDetails propertyDetails;
        private PropertyIncome propertyIncome;

        PropertyValueObjectBuilder() {
        }

        public PropertyValueObject.PropertyValueObjectBuilder propertyId(PropertyId propertyId) {
            this.propertyId = propertyId;
            return this;
        }

        public PropertyValueObject.PropertyValueObjectBuilder loanTransactionId(LoanTransactionId loanTransactionId) {
            this.loanTransactionId = loanTransactionId;
            return this;
        }

        public PropertyValueObject.PropertyValueObjectBuilder subjectPropertyIndicator(boolean subjectPropertyIndicator) {
            this.subjectPropertyIndicator = subjectPropertyIndicator;
            return this;
        }

        public PropertyValueObject.PropertyValueObjectBuilder propertyAddress(PostalAddress propertyAddress) {
            this.propertyAddress = propertyAddress;
            return this;
        }

        public PropertyValueObject.PropertyValueObjectBuilder propertyDetails(PropertyDetails propertyDetails) {
            this.propertyDetails = propertyDetails;
            return this;
        }

        public PropertyValueObject.PropertyValueObjectBuilder propertyIncome(PropertyIncome propertyIncome) {
            this.propertyIncome = propertyIncome;
            return this;
        }

        public PropertyValueObject build() {
            return new PropertyValueObject(propertyId,
                                           loanTransactionId,
                                           subjectPropertyIndicator,
                                           propertyAddress,
                                           propertyDetails,
                                           propertyIncome);
        }

        public String toString() {
            return "com.company.loanapp.common.property.valueObjects.PropertyValueObject.PropertyValueObjectBuilder(propertyId=" + this.propertyId + ", loanTransactionId=" + this.loanTransactionId + ", subjectPropertyIndicator=" + this.subjectPropertyIndicator + ", propertyAddress=" + this.propertyAddress + ", propertyDetails=" + this.propertyDetails + ", propertyIncome=" + this.propertyIncome + ")";
        }
    }
}
