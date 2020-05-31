package com.tasarim.visitor;

public class Ship implements Acceptor {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
