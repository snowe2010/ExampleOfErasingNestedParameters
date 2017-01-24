package com.example.stuff;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @author tylerthrailkill
 */
public final class PropertyId extends SuperId {
    public static final String ID_NAME = "propertyId";

    public PropertyId() {
        super(UUID.randomUUID());
    }

    public PropertyId(UUID propertyId) {
        super(propertyId);
    }

    @JsonCreator
    public PropertyId(String propertyId) {
        super(propertyId);
    }

    @JsonValue
    @JsonProperty(ID_NAME)
    @Override
    public UUID getId() {
        return id;
    }

}
