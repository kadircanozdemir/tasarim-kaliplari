package com.tasarim;

import com.tasarim.prototype.*;
import com.tasarim.iterator.*;
import com.tasarim.visitor.*;
import com.tasarim.composite.*;

import java.util.ArrayList;

public class Main {

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

    }
}
