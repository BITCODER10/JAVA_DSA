package com.logicalnil;

import java.sql.Time;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        long startTime;
        long endTime;
        long elapsedTime;

        for (int i = 0; i < 1_000_000; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }

//        ---------------------- LinkedList -------------------------------
        System.out.println(startTime = System.nanoTime());

//        linkedList.add(500000, 5000);
//        linkedList.remove((Integer) 500000);
//        linkedList.getFirst();
        linkedList.getLast();

        System.out.println(endTime = System.nanoTime());
        elapsedTime = endTime - startTime;
        System.out.println("Total time required LinkedList: "+ (double)elapsedTime / 1_000_000_000);


//        ---------------------- ArrayList -------------------------------
        System.out.println(startTime = System.nanoTime());

//        arrayList.add(500000, 5000);
//        arrayList.remove((Integer) 500000);
//        arrayList.getFirst();
        arrayList.getLast();

        System.out.println(endTime = System.nanoTime());
        elapsedTime = endTime - startTime;
        System.out.println("Total time required for ArrayList: "+ (double)elapsedTime / 1_000_000_000);

    }
}