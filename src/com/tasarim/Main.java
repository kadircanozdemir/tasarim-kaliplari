package com.tasarim;

import com.tasarim.prototype.Menu;
import com.tasarim.prototype.UserMenu;
import com.tasarim.prototype.VisitorMenu;

public class Main {

    public static void main(String[] args) {
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

    }
}
