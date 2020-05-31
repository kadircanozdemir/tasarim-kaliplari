package com.tasarim.composite;

public class Doctor implements Identity {
    @Override
    public String getEmployeeId() {
        return "D" + System.currentTimeMillis();
    }
}
