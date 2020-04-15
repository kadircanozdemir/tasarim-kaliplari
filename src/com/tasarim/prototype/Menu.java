package com.tasarim.prototype;

import java.util.ArrayList;
import java.util.List;

public abstract class Menu implements Cloneable {

    private List<String> menuItems = new ArrayList<String>();

    public List<String> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<String> menuItems) {
        this.menuItems = menuItems;
    }

    public void drawMenu() {
        menuItems.add("Ana Sayfa");
        menuItems.add("Dersler");
        menuItems.add("Projeler");
        menuItems.add("Kurslar");
    }

    public void addItem(String item) {
        menuItems.add(item);
    }

    public abstract Menu clone() throws CloneNotSupportedException;


}
