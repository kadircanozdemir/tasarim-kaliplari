package com.tasarim.prototype;

import java.util.ArrayList;

public class UserMenu extends Menu {

    public UserMenu() {
        drawMenu();
    }


    @Override
    public Menu clone() throws CloneNotSupportedException {
        Menu userMenu = new UserMenu();

        userMenu.setMenuItems(new ArrayList<String>(getMenuItems()));

        return userMenu;
    }

    @Override
    public String toString() {
        return " [Id: " + this.hashCode() + ", Items: " + getMenuItems().toString() + ", ItemsHasCode " + this.getMenuItems().hashCode() + "] ";
    }
}
