package com.tasarim.composite;

import java.util.ArrayList;

import com.tasarim.Main;

public class Field implements CampField {
    private int kisiSayisi;
    private String description;

    private ArrayList<CampField> campList = new ArrayList<>();

    public Field(int kisiSayisi, String description) {
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

    public void addCamp(CampField campField) {
        campList.add(campField);
    }

    @Override
    public void showInfo() {
        System.out
                .println(Main.stringBuffer + getDescription() + ", Kamp Alanı Toplam Kisi Sayısı: " + getKisiSayisi());

        Main.stringBuffer.append("   ");

        for (CampField camp : campList) {
            camp.showInfo();
        }

        Main.stringBuffer.setLength(Main.stringBuffer.length() - 3);
    }

}