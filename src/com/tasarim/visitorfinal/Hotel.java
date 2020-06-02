package com.tasarim.visitorfinal;

public class Hotel implements PriceAcceptor {

    private double price;
    private double rentPrice;
    private String description;

    public Hotel(double price, String description) {
        this.setPrice(price);
        this.setDescription(description);
    }

    public double getRentPrice() {
        return rentPrice;
    }

    public void setRentPrice(double rentPrice) {
        this.rentPrice = rentPrice;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public void accept(PriceCalculator priceCalculator) {
        priceCalculator.calculate(this);
    }
}