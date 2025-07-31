package com.logicalnil;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nWhat is the length of your array : ");
        int[] array =  new int[scanner.nextInt()];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0,99);
        }

        System.out.println("Original array is : "+ Arrays.toString(array));
        System.out.println();
        BubbleSortClass bubbleSortObject = new BubbleSortClass(array);
        System.out.println("\nSorted Array is : "+Arrays.toString(bubbleSortObject.sortArraylogic()));
        scanner.close();
    }
}