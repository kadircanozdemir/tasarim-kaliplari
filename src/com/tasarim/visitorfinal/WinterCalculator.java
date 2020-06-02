package com.tasarim.visitorfinal;

public class WinterCalculator implements PriceCalculator {

    @Override
    public void calculate(Hotel hotel) {
        hotel.setRentPrice(hotel.getPrice() * 0.5);
        System.out.println(hotel.getDescription() + ", Fiyat: " + hotel.getRentPrice());
    }

    @Override
    public void calculate(Tent tent) {
        tent.setRentPrice(tent.getPrice() * 0.5);
        System.out.println(tent.getDescription() + ", Fiyat: " + tent.getRentPrice());
    }

}