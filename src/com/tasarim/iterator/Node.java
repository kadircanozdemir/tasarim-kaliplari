package com.tasarim.iterator;

import java.util.ArrayList;

public class Node {
    private String id;
    private String name;
    private ArrayList<Node> childes;

    public Node(String id, String name) {
        this.id = id;
        this.name = name;
        this.childes = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Node> getChildes() {
        return childes;
    }

    public void setChildes(ArrayList<Node> childes) {
        this.childes = childes;
    }

    public void addChild(Node child) {
        this.childes.add(child);
    }

    public String toString() {
        return this.getName();
    }
}
