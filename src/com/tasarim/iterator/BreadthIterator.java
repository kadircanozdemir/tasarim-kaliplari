package com.tasarim.iterator;

import java.util.ArrayList;

public class BreadthIterator implements Iterator {

    private ArrayList<Node> tree = new BreadthTree().getTree();
    private int index = 0;
    private int temp = 0;

    public Boolean hasNext() {

        if (index < tree.size()) {
            return true;
        } else {
            return false;
        }
    }

    public Boolean hasNextLevel() {
        while (temp < index) {
            if (tree.get(temp).getChildes().size() > 0) {
                return true;
            } else {
                temp++;
            }
        }
        return false;
    }

    public void first() {

        index = 0;
    }

    public void next() {

        index++;
        if (hasNextLevel()) {
            nextLevel();
        }
    }

    public void nextLevel() {

        tree.addAll(tree.get(temp).getChildes());
        temp++;
    }

    public Object currentItem() {
        if (tree.get(index) != null) {
            return tree.get(index);
        }
        return false;
    }

}
