package com.tasarim.composite;

public class Client {
    public static void run() {
        Field sahil = new Field(150, "Sahil Bölgesi");
        Field orman = new Field(50, "Orman Bölgesi");
        Field kumsal = new Field(100, "Kumsal Bölgesi");

        CampTent cadir1 = new CampTent(5, "Orman Bölgesi Çadır 1");
        CampTent cadir2 = new CampTent(5, "Orman Bölgesi Çadır 2");
        Bungalov bungalov1 = new Bungalov(4, "Orman Bölgesi Bungalov 1");
        Bungalov bungalov2 = new Bungalov(5, "Orman Bölgesi Bungalov 2");

        CampTent cadir3 = new CampTent(5, "Kumsal Bölgesi Çadır 3");
        CampTent cadir4 = new CampTent(5, "Kumsal Bölgesi Çadır 4");

        sahil.addCamp(orman);
        orman.addCamp(cadir1);
        orman.addCamp(cadir2);
        orman.addCamp(bungalov1);
        orman.addCamp(bungalov2);

        sahil.addCamp(kumsal);
        kumsal.addCamp(cadir3);
        kumsal.addCamp(cadir4);

        sahil.showInfo();
    }
}
