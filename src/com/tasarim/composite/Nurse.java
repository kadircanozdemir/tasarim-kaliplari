package com.tasarim.composite;

public class Nurse implements Identity {
    @Override
    public void getEmployeeId() {
        System.out.println("N" + System.currentTimeMillis());
    }
}
