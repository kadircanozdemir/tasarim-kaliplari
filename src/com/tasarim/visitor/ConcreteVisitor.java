package com.tasarim.visitor;

public class ConcreteVisitor implements Visitor {
    @Override
    public void visit(Car car) {
        System.out.println("I'm the car");
    }

    @Override
    public void visit(Plane plane) {
        System.out.println("I'm the plane");

    }

    @Override
    public void visit(Ship ship) {
        System.out.println("I'm the ship");

    }
}
