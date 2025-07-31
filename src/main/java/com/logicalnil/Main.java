package com.logicalnil;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.print("\n Enter value whose index you want to find :");
        int target = scanner.nextInt();

        InterpolationSeachClass interpolationSeachObject = new InterpolationSeachClass(array, 0, array.length, target);
        interpolationSeachObject.runLogic();
        scanner.close();
    }
}