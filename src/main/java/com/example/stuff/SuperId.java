package com.example.stuff;

import java.io.Serializable;
import java.util.UUID;

public abstract class SuperId implements Comparable<SuperId>, Serializable {
    protected final UUID id;

    public SuperId(UUID id) throws RuntimeException {
        this.id = id;
    }

    public SuperId(String id) {
        this(UUID.fromString(id));
    }

    public abstract UUID getId();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SuperId oId = (SuperId) o;
        return id != null ? id.equals(oId.id) : oId.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return id.toString();
    }

    @Override
    public int compareTo(SuperId compareId) {
        return this.id.compareTo(compareId.getId());
    }

}
