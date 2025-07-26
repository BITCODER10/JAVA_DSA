package com.logicalnil;

import java.util.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LinkedListClass<String> linkedListClass = new LinkedListClass<>();
        linkedListClass.addFirst("Swapnil");

        linkedListClass.printAll();
        linkedListClass.insert("Sw");
        linkedListClass.insert("Sw2");
        linkedListClass.insert("Sw3");
        linkedListClass.insert("Sw4");
        linkedListClass.addLast("Desai");
        linkedListClass.printAll();
        linkedListClass.removeFrom();
        linkedListClass.removeFrom();
        linkedListClass.removeFrom();
        linkedListClass.printAll();
        linkedListClass.insertAt(2, "Vijay");
        linkedListClass.printAll();
        linkedListClass.insertAt(2, "Ajay");
        linkedListClass.printAll();
        linkedListClass.insertAt(2, "Sujay");
        linkedListClass.printAll();
        linkedListClass.remove("Ajay");
        linkedListClass.remove("Sujay");
        linkedListClass.printAll();
        linkedListClass.peepFirst();
    }
}