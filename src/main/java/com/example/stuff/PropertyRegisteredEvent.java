package com.example.stuff;

/**
 *
 */
public class PropertyRegisteredEvent {
    String id;

    PropertyValueObject property;

    public PropertyRegisteredEvent(String id, PropertyValueObject property) {
        this.id = id;
        this.property = property;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PropertyValueObject getProperty() {
        return property;
    }

    public void setProperty(PropertyValueObject property) {
        this.property = property;
    }
}
