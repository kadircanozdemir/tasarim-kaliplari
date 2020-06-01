package com.tasarim.composite;

import java.util.ArrayList;

public class Hospital implements Identity {

    private ArrayList<Identity> employeeList = new ArrayList<Identity>();

    public void addEmployee(Identity identity) {
        employeeList.add(identity);
    }

    public void getEmployeeId() {
        for (Identity item : employeeList) {
            item.getEmployeeId();
        }
    }
}
