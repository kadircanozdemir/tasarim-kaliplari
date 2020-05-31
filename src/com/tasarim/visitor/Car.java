package com.tasarim.visitor;

public class Car implements Acceptor {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
