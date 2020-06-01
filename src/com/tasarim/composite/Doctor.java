package com.tasarim.composite;

public class Doctor implements Identity {
    @Override
    public void getEmployeeId() {
        System.out.println("D" + System.currentTimeMillis());
    }
}
