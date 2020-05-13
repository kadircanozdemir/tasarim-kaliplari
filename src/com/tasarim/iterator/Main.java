package com.tasarim.iterator;

public class Main {

    public static void main(String[] args) {

        BreadthTree bTree = new BreadthTree();
        Iterator bItr = bTree.getIterator();

        while (bItr.hasNext()) {
            System.out.println(bItr.currentItem().toString());

            bItr.next();
            if (!bItr.hasNext()) {
                if (bItr.hasNextLevel()) {
                    bItr.nextLevel();
                }
            }
        }


//        for (bItr.first(); bItr.hasNext(); bItr.next()) {
//            System.out.println(bItr.currentItem().toString());
//
//
//            if (!bItr.hasNext()) {
//                if (bItr.hasNextLevel()) {
//                    bItr.nextLevel();
//                }
//            }
//        }


    }
}
