package com.tasarim.prototype;

public class VisitorMenu extends Menu {

    public VisitorMenu() {
        drawMenu();
    }

    @Override
    public Menu clone() throws CloneNotSupportedException {
        Menu visitorMenu = new VisitorMenu();

        visitorMenu.setMenuItems(getMenuItems());

        return visitorMenu;
    }

    @Override
    public String toString() {
        return " [Id: " + this.hashCode() + ", Items: " + getMenuItems().toString() + ", ItemsHasCode " + this.getMenuItems().hashCode() + "] ";
    }
}
