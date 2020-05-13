package com.tasarim.iterator;

import java.util.ArrayList;

public class BreadthTree implements Iterable {
    private ArrayList<Node> tree = new ArrayList<>();

    public BreadthTree() {
        this.tree.add(buildTree());
    }

    public Node buildTree() {

        Node node0 = new Node("0", "node0-level0");

        Node node1 = new Node("1", "node1-level1");
        Node node2 = new Node("2", "node2-level1");
        Node node3 = new Node("3", "node3-level1");
        Node node4 = new Node("4", "node4-level1");

        Node node5 = new Node("5", "node5-level2");
        Node node6 = new Node("6", "node6-level2");

        Node node7 = new Node("7", "node7-level2");
        Node node8 = new Node("8", "node8-level2");

        Node node9 = new Node("9", "node9-level3");
        Node node10 = new Node("10", "node10-level3");

        node6.addChild(node9);
        node7.addChild(node10);

        node1.addChild(node5);
        node1.addChild(node6);

        node3.addChild(node7);
        node3.addChild(node8);

        node0.addChild(node1);
        node0.addChild(node2);
        node0.addChild(node3);
        node0.addChild(node4);

        return node0;
    }

    public Iterator getIterator() {
        return new BreadthIterator();
    }

    public ArrayList<Node> getTree() {
        return tree;
    }
}
