package com.logicalnil;

import java.util.Collection;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PriorityQueueObject<Integer> priorityQueueObject = new PriorityQueueObject<>();
        for (int i=10 ; i>=0; i--){
            priorityQueueObject.addEntry(i);
        }
        for (Integer i : priorityQueueObject.getpQueue()){
            System.out.println(Integer.valueOf(i));
        }

        priorityQueueObject.printObject();

        // output is [0, 1, 5, 4, 2, 9, 6, 10, 7, 8, 3] because its min heap
    }
}