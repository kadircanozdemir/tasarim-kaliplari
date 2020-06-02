package com.tasarim.visitor;

public interface PriceCalculator {
    void calculate(Hotel hotel);

    void calculate(Tent tent);
}