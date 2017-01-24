package com.example.stuff;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Money implements Serializable {
    public static final int MAX_PRECISION = 12;
    public static final Money ZERO = new Money(0.0);

    @JsonProperty("amount")
    BigDecimal amount;

    public Money(BigDecimal amount) {
        amount = amount.setScale(2, BigDecimal.ROUND_HALF_UP);
        int precision = amount.precision();
        this.amount = amount;

    }

    public Money(double amount) {
        this(new BigDecimal(amount).setScale(2, BigDecimal.ROUND_HALF_UP));
    }

    public Money add(Money addend) {
        return new Money(amount.add(addend.amount));
    }

    public Money add(BigDecimal addend) {
        return new Money(amount.add(addend));
    }

    public Money add(BigDecimal augend, BigDecimal addend) {
        return new Money(augend.add(addend));
    }

    public Money add(Money augend, Money addend) {
        return new Money(augend.amount.add(addend.amount));
    }

    public BigDecimal getAmount() {
        return this.amount;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Money)) return false;
        final Money other = (Money) o;
        final Object this$amount = this.getAmount();
        final Object other$amount = other.getAmount();
        if (this$amount == null ? other$amount != null : !this$amount.equals(other$amount)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $amount = this.getAmount();
        result = result * PRIME + ($amount == null ? 43 : $amount.hashCode());
        return result;
    }

    public String toString() {
        return "com.company.common.core.domain.valueobjects.Money(amount=" + this.getAmount() + ")";
    }
}
