package com.tasarim;

import com.tasarim.prototype.*;
import com.tasarim.iterator.*;

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
        com.tasarim.visitor.Client.run();

        // COMPOSITE FINAL
        com.tasarim.composite.Client.run();

    }
}
