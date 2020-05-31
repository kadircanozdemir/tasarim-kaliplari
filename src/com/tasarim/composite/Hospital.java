package com.tasarim.composite;

import java.util.ArrayList;

public class Hospital {

    private ArrayList<Identity> employeeList = new ArrayList<Identity>();

    public void addEmployee(Identity identity) {
        employeeList.add(identity);
    }

    public void showIds() {
        for (Identity item : employeeList) {
            System.out.println(item.getEmployeeId());
        }
    }
}
