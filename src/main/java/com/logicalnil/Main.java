package com.logicalnil;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter size of the array : ");
        int[] array = new int[scanner.nextInt()];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(99);
        }

        InsertionSort insertionSortObject = new InsertionSort(array);
        System.out.print("\nAuto Generated Array : ");
        System.out.println(insertionSortObject.toString());

        insertionSortObject.runLogic();
        System.out.println("\n\n\nFinal Result"+insertionSortObject.toString());

    }
}

//Remember Technic: For a While think about insertion
//Its like finding the right place of value