package com.logicalnil;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StackObject classFive = new StackObject();
        System.out.print("What is count of students in fifth class : ");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < numberOfStudents; i++) {
            classFive.addStudent(createStudent(scanner));
        }
        classFive.printStack();
        classFive.checkSize();
        classFive.removeRecentEntry();
        classFive.checkIfEntryStarted();
        classFive.checkTopEntry();
        System.out.println("Class Five is "+classFive);
        scanner.close();
    }

    public static Student createStudent(Scanner scanner){
        Student student = new Student();
        System.out.print("\n Enter First Name :");
        student.setfName(scanner.nextLine());
        System.out.print("\n Enter Last Name :");
        student.setlName(scanner.nextLine());
        System.out.print("\n Enter GPA Name :");
        student.setGpa(scanner.nextDouble());
        System.out.print("\n Did you pass ? (true / false) :");
        student.setResult(scanner.nextBoolean());
        scanner.nextLine();
        return student;
    }
}