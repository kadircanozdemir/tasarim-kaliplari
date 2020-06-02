package com.tasarim.visitor;

public interface PriceAcceptor {
    void accept(PriceCalculator priceCalculator);
}