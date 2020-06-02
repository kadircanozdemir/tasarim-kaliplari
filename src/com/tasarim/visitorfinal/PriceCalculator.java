package com.tasarim.visitorfinal;

public interface PriceCalculator {
    void calculate(Hotel hotel);

    void calculate(Tent tent);
}