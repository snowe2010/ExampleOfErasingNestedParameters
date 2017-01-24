package com.example.stuff;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @author tylerthrailkill
 */
public final class LoanTransactionId extends SuperId {
    public static final String ID_NAME = "loanTransactionId";

    public LoanTransactionId() {
        super(UUID.randomUUID());
    }

    public LoanTransactionId(UUID id) {
        super(id);
    }

    @JsonCreator
    public LoanTransactionId(String id) {
        super(id);
    }


    @JsonValue
    @JsonProperty(ID_NAME)
    @Override
    public UUID getId() {
        return id;
    }

}
