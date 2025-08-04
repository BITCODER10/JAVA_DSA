package com.logicalnil;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RecursionForFactorial recursionForFactorialObject = new RecursionForFactorial();
        Scanner scanner = new Scanner(System.in);

            try {
                System.out.print("\n\nEnter integer to find Factorial ");
                recursionForFactorialObject.setUpperLimit(scanner.nextInt());
            }catch (InputMismatchException e){
                System.out.println("Enter Valid Integer Value");
            } catch (Exception e) {
                System.out.println(e);
            }


        System.out.println(recursionForFactorialObject.runLogic());
        scanner.close();
    }
}