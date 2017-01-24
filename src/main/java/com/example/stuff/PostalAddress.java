package com.example.stuff;

import java.io.Serializable;

public final class PostalAddress implements Serializable {

    private static final long serialVersionUID = 1L;

    private String streetAddress1;

    private String streetAddress2;

    private String city;

    // TODO Consider making a StandardType
    private String stateProvince;

    // TODO Consider making PostCode a value object composed of both postal code
    // and plus four members .. or just let all state be managed in single
    // postal code member
    private String postalCode;

    private String postalCodePlusFour;

    // TODO Consider making a StandardType
    private String countryCode;

    private Boolean validated;

    public PostalAddress(String streetAddress1,
                         String streetAddress2,
                         String city,
                         String stateProvince,
                         String postalCode,
                         String postalCodePlusFour,
                         String countryCode,
                         Boolean validated) {
        super();

        this.streetAddress1 = validateStreetAddress1(streetAddress1);
        this.streetAddress2 = validateStreetAddress2(streetAddress2);
        this.city = validateCity(city);
        this.countryCode = validateCountryCode(countryCode);
        this.postalCode = validatePostalCode(postalCode);
        this.postalCodePlusFour = validatePostalCodePlusFour(postalCodePlusFour);
        this.stateProvince = validateStateProvince(stateProvince);
        if (validated == null) {
            this.validated = new Boolean(false);
        } else {
            this.validated = validated;
        }
    }

    public PostalAddress(String postalCode) {
        this(null, null, null, null, postalCode, null, null, null);
    }

    private String validateStreetAddress1(String streetAddress1) {
        if (streetAddress1 != null) {
        }
        return streetAddress1;
    }

    private String validateStreetAddress2(String streetAddress2) {
        if (streetAddress2 != null) {
        }

        return streetAddress2;
    }

    private String validateCity(String city) {
        if (city != null) {
        }

        return city;
    }

    private String validateCountryCode(String countryCode) {
        if (countryCode != null) {
        }

        return countryCode;
    }

    private String validatePostalCode(String postalCode) {
        if (postalCode != null) {
        }

        return postalCode;
    }

    private String validatePostalCodePlusFour(String postalCodePlusFour) {
        if (postalCodePlusFour != null) {
        }

        return postalCodePlusFour;
    }

    private String validateStateProvince(String stateProvince) {
        if (stateProvince != null) {
        }
        // TODO validate with data team

        return stateProvince;
    }

    public String getStreetAddress1() {
        return this.streetAddress1;
    }

    public String getStreetAddress2() {
        return this.streetAddress2;
    }

    public String getCity() {
        return this.city;
    }

    public String getStateProvince() {
        return this.stateProvince;
    }

    public String getPostalCode() {
        return this.postalCode;
    }

    public String getPostalCodePlusFour() {
        return this.postalCodePlusFour;
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    public Boolean getValidated() {
        return this.validated;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof PostalAddress)) return false;
        final PostalAddress other = (PostalAddress) o;
        final Object this$streetAddress1 = this.getStreetAddress1();
        final Object other$streetAddress1 = other.getStreetAddress1();
        if (this$streetAddress1 == null ? other$streetAddress1 != null : !this$streetAddress1.equals(
                other$streetAddress1)) return false;
        final Object this$streetAddress2 = this.getStreetAddress2();
        final Object other$streetAddress2 = other.getStreetAddress2();
        if (this$streetAddress2 == null ? other$streetAddress2 != null : !this$streetAddress2.equals(
                other$streetAddress2)) return false;
        final Object this$city = this.getCity();
        final Object other$city = other.getCity();
        if (this$city == null ? other$city != null : !this$city.equals(other$city)) return false;
        final Object this$stateProvince = this.getStateProvince();
        final Object other$stateProvince = other.getStateProvince();
        if (this$stateProvince == null ? other$stateProvince != null : !this$stateProvince.equals(other$stateProvince))
            return false;
        final Object this$postalCode = this.getPostalCode();
        final Object other$postalCode = other.getPostalCode();
        if (this$postalCode == null ? other$postalCode != null : !this$postalCode.equals(other$postalCode))
            return false;
        final Object this$postalCodePlusFour = this.getPostalCodePlusFour();
        final Object other$postalCodePlusFour = other.getPostalCodePlusFour();
        if (this$postalCodePlusFour == null ? other$postalCodePlusFour != null : !this$postalCodePlusFour.equals(
                other$postalCodePlusFour)) return false;
        final Object this$countryCode = this.getCountryCode();
        final Object other$countryCode = other.getCountryCode();
        if (this$countryCode == null ? other$countryCode != null : !this$countryCode.equals(other$countryCode))
            return false;
        final Object this$validated = this.getValidated();
        final Object other$validated = other.getValidated();
        if (this$validated == null ? other$validated != null : !this$validated.equals(other$validated)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $streetAddress1 = this.getStreetAddress1();
        result = result * PRIME + ($streetAddress1 == null ? 43 : $streetAddress1.hashCode());
        final Object $streetAddress2 = this.getStreetAddress2();
        result = result * PRIME + ($streetAddress2 == null ? 43 : $streetAddress2.hashCode());
        final Object $city = this.getCity();
        result = result * PRIME + ($city == null ? 43 : $city.hashCode());
        final Object $stateProvince = this.getStateProvince();
        result = result * PRIME + ($stateProvince == null ? 43 : $stateProvince.hashCode());
        final Object $postalCode = this.getPostalCode();
        result = result * PRIME + ($postalCode == null ? 43 : $postalCode.hashCode());
        final Object $postalCodePlusFour = this.getPostalCodePlusFour();
        result = result * PRIME + ($postalCodePlusFour == null ? 43 : $postalCodePlusFour.hashCode());
        final Object $countryCode = this.getCountryCode();
        result = result * PRIME + ($countryCode == null ? 43 : $countryCode.hashCode());
        final Object $validated = this.getValidated();
        result = result * PRIME + ($validated == null ? 43 : $validated.hashCode());
        return result;
    }

    public String toString() {
        return "com.company.common.core.domain.valueobjects.PostalAddress(streetAddress1=" + this.getStreetAddress1() + ", streetAddress2=" + this.getStreetAddress2() + ", city=" + this.getCity() + ", stateProvince=" + this.getStateProvince() + ", postalCode=" + this.getPostalCode() + ", postalCodePlusFour=" + this.getPostalCodePlusFour() + ", countryCode=" + this.getCountryCode() + ", validated=" + this.getValidated() + ")";
    }
}
