package com.example.stuff;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @author tylerthrailkill
 */
public final class ApplicantId extends SuperId {
    public static final String ID_NAME = "applicantId";

    public ApplicantId() {
        super(UUID.randomUUID());
    }

    public ApplicantId(UUID applicantId) {
        super(applicantId);
    }

    @JsonCreator
    public ApplicantId(String applicantId) {
        super(applicantId);
    }

    @JsonValue
    @JsonProperty(ID_NAME)
    @Override
    public UUID getId() {
        return id;
    }

}
