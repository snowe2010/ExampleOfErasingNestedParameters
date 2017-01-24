package com.example;


public class PropertyDetails {

    int yearBuilt;

    float acreage;

    int numberOfUnits;

    private String county;

    public PropertyDetails(

                           int yearBuilt,
                           float acreage,
                           int numberOfUnits,
                           String county) {
        this.yearBuilt = yearBuilt;
        this.acreage = acreage;
        this.numberOfUnits = numberOfUnits;
        this.county = county;
    }

    public static PropertyDetailsBuilder builder() {
        return new PropertyDetailsBuilder();
    }


    public int getYearBuilt() {
        return this.yearBuilt;
    }

    public float getAcreage() {
        return this.acreage;
    }

    public int getNumberOfUnits() {
        return this.numberOfUnits;
    }

    public String getCounty() {
        return this.county;
    }



    public static class PropertyDetailsBuilder {
        private int yearBuilt;
        private float acreage;
        private int numberOfUnits;
        private String county;

        PropertyDetailsBuilder() {
        }


        public PropertyDetails.PropertyDetailsBuilder yearBuilt(int yearBuilt) {
            this.yearBuilt = yearBuilt;
            return this;
        }

        public PropertyDetails.PropertyDetailsBuilder acreage(float acreage) {
            this.acreage = acreage;
            return this;
        }

        public PropertyDetails.PropertyDetailsBuilder numberOfUnits(int numberOfUnits) {
            this.numberOfUnits = numberOfUnits;
            return this;
        }


        public PropertyDetails.PropertyDetailsBuilder county(String county) {
            this.county = county;
            return this;
        }

        public PropertyDetails build() {
            return new PropertyDetails(
                                       yearBuilt,
                                       acreage,
                                       numberOfUnits,
                                       county);
        }

    }
}
