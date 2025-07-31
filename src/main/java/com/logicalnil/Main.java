package com.logicalnil;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LinerSearchClass linerSearchObject = new LinerSearchClass();
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        int exit =0;
        while(exit == 0){
            System.out.print("\nEnter value for Arraylist :");
            arrayList.add(scanner.nextInt());
            System.out.print("\nExit ? 1 to exit 0 to continue ");
            exit = scanner.nextInt();
        }
        linerSearchObject.setArrayList(arrayList);
        System.out.print("\nEnter the integer whose index you want to find : ");
        int findIndexOf = scanner.nextInt();
        if(linerSearchObject.linearSearch(findIndexOf) == -1){
            System.out.println("Object not found !");
        }else  System.out.printf("Index of %d is %d ", findIndexOf , linerSearchObject.linearSearch(findIndexOf));
        System.out.println("\n"+linerSearchObject.printAll().toString());
    }
}