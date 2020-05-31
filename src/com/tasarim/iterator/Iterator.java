package com.tasarim.iterator;

public interface Iterator {
    Boolean hasNext();

    void first();

    void next();

    Object currentItem();
}
