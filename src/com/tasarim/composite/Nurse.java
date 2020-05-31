package com.tasarim.composite;

public class Nurse implements Identity {
    @Override
    public String getEmployeeId() {
        return "N" + System.currentTimeMillis();
    }
}
