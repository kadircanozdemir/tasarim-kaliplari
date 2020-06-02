package com.tasarim.visitor;

import java.util.ArrayList;

public class Client {

    public static void run() {
        Hotel luxHotel = new Hotel(100, "Lux Hotel: Tek Kişilik Oda");
        Hotel kouHotel = new Hotel(300, "Kou Hotel: Ikı Kişilik Oda");

        Tent smallTent = new Tent(50, "Tek Kişilik Çadır");
        Tent bigTent = new Tent(200, "Dört Kişilik Çadır");

        SummerCalculator summerCalculator = new SummerCalculator();
        WinterCalculator winterCalculator = new WinterCalculator();

        ArrayList<PriceAcceptor> acceptors = new ArrayList<>();
        acceptors.add(luxHotel);
        acceptors.add(kouHotel);
        acceptors.add(smallTent);
        acceptors.add(bigTent);

        System.out.println("Yaz Mevsimi Kiralık Oda ve Çadır Fiyatları");
        for (PriceAcceptor acceptor : acceptors) {
            acceptor.accept(summerCalculator);
        }

        System.out.println("Kış Mevsimi Kiralık Oda ve Çadır Fiyatları");
        for (PriceAcceptor acceptor : acceptors) {
            acceptor.accept(winterCalculator);
        }

    }

}
