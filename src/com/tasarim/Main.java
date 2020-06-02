package com.tasarim;

import com.tasarim.prototype.*;
import com.tasarim.iterator.*;
import com.tasarim.visitor.*;
import com.tasarim.visitorfinal.*;
import com.tasarim.composite.*;
import com.tasarim.compositefinal.*;

import java.util.ArrayList;

public class Main {

    public static StringBuffer stringBuffer = new StringBuffer();

    public static void main(String[] args) {

        // PROTOTYPE
        Menu userMenu1 = new UserMenu();
        Menu visitorMenu1 = new VisitorMenu();

        try {
            UserMenu userMenu2 = (UserMenu) userMenu1.clone();
            userMenu1.addItem("Kullanıcı1");
            userMenu2.addItem("Kullanıcı2");

            VisitorMenu visitorMenu2 = (VisitorMenu) visitorMenu1.clone();
            visitorMenu1.addItem("Ziyaretci");

            System.out.println(userMenu1.toString());
            System.out.println(userMenu2.toString());
            System.out.println(visitorMenu1.toString());
            System.out.println(visitorMenu2.toString());

        } catch (CloneNotSupportedException ex) {
            System.out.println(ex);
        }

        // ITERATOR
        BreadthTree bTree = new BreadthTree();
        Iterator bItr = bTree.getIterator();

        while (bItr.hasNext()) {
            System.out.println(bItr.currentItem().toString());

            bItr.next();
        }

        // VISITOR
        Car car = new Car();
        Car car1 = new Car();
        Car car2 = new Car();
        Plane plane = new Plane();
        Plane plane1 = new Plane();
        Plane plane2 = new Plane();
        Ship ship = new Ship();
        Ship ship1 = new Ship();
        Ship ship2 = new Ship();

        ArrayList<Acceptor> acceptors = new ArrayList<Acceptor>();
        acceptors.add(car);
        acceptors.add(car1);
        acceptors.add(car2);

        acceptors.add(plane);
        acceptors.add(plane1);
        acceptors.add(plane2);

        acceptors.add(ship);
        acceptors.add(ship1);
        acceptors.add(ship2);

        ConcreteVisitor cVisitor = new ConcreteVisitor();

        for (int i = 0; i < acceptors.size(); i++) {
            acceptors.get(i).accept(cVisitor);
        }

        // COMPOSITE
        Hospital hospital = new Hospital();

        Doctor doctor = new Doctor();
        Nurse nurse = new Nurse();
        hospital.addEmployee(doctor);
        hospital.addEmployee(nurse);
        Hospital hospital2 = new Hospital();
        Doctor doctor2 = new Doctor();
        Nurse nurse2 = new Nurse();
        Hospital hospital3 = new Hospital();
        Doctor doctor3 = new Doctor();
        Nurse nurse3 = new Nurse();

        hospital2.addEmployee(doctor2);
        hospital2.addEmployee(nurse2);
        hospital3.addEmployee(doctor3);
        hospital3.addEmployee(nurse3);
        hospital2.addEmployee(hospital3);
        hospital.addEmployee(hospital2);

        hospital.getEmployeeId();

        // VISITOR FINAL

        Hotel luxHotel = new Hotel(100, "Lux Hotel: Tek Kişilik Oda");
        Hotel kouHotel = new Hotel(300, "Kou Hotel: Ikı Kişilik Oda");

        Tent smallTent = new Tent(50, "Tek Kişilik Çadır");
        Tent bigTent = new Tent(200, "Dört Kişilik Çadır");

        SummerCalculator summerCalculator = new SummerCalculator();
        WinterCalculator winterCalculator = new WinterCalculator();

        System.out.println("Yaz Mevsimi Kiralık Oda ve Çadır Fiyatları");
        luxHotel.accept(summerCalculator);
        kouHotel.accept(summerCalculator);
        smallTent.accept(summerCalculator);
        bigTent.accept(summerCalculator);

        System.out.println("Kış Mevsimi Kiralık Oda ve Çadır Fiyatları");
        luxHotel.accept(winterCalculator);
        kouHotel.accept(winterCalculator);
        smallTent.accept(winterCalculator);
        bigTent.accept(winterCalculator);

        // COMPOSITE FINAL

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
