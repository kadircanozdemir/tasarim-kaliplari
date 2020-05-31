package com.tasarim.visitor;

public class Plane implements Acceptor {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
