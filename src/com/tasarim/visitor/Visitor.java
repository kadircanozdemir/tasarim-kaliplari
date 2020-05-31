package com.tasarim.visitor;

public interface Visitor {
    void visit(Car car);

    void visit(Plane plane);

    void visit(Ship ship);
}
