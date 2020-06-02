package com.tasarim.visitor;

public class SummerCalculator implements PriceCalculator {

    @Override
    public void calculate(Hotel hotel) {
        hotel.setRentPrice(hotel.getPrice() * 1.5);
        System.out.println(hotel.getDescription() + ", Fiyat: " + hotel.getRentPrice());
    }

    @Override
    public void calculate(Tent tent) {
        tent.setRentPrice(tent.getPrice() * 1.5);
        System.out.println(tent.getDescription() + ", Fiyat: " + tent.getRentPrice());
    }

}