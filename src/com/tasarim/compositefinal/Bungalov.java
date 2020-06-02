package com.tasarim.compositefinal;

import com.tasarim.Main;

public class Bungalov implements CampField {
    private int kisiSayisi;
    private String description;

    public Bungalov(int kisiSayisi, String description) {
        this.setKisiSayisi(kisiSayisi);
        this.setDescription(description);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getKisiSayisi() {
        return kisiSayisi;
    }

    public void setKisiSayisi(int kisiSayisi) {
        this.kisiSayisi = kisiSayisi;
    }

    @Override
    public void showInfo() {
        System.out.println(Main.stringBuffer + getDescription() + ", Kisi Sayisi: " + getKisiSayisi());
    }
}