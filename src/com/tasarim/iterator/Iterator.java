package com.tasarim.iterator;

public interface Iterator {
    Boolean hasNext();
    Boolean hasNextLevel();
    void first();
    void next();
    void nextLevel();
    Object currentItem();
}
