package com.logicalnil;

import java.util.Stack;

public class StackObject {
    Stack<Student> students = new Stack<>();

    StackObject(){

    }

    void addStudent(Student s){
        students.push(s);
        System.out.println("Student Added Successfully");
    }
    void removeRecentEntry(){
        Student currentStudent = students.pop();
        System.out.println("Following entry is removed from the stack : "+currentStudent);
        System.out.println("Removed Student is :"+ currentStudent.getfName() +" "+ currentStudent.getlName());
    }
    void checkTopEntry(){
        Student currentStudent = students.peek();
        System.out.println("The top entry is : "+students.peek());
        System.out.println("Top entry is  :"+ currentStudent.getfName() +" "+ currentStudent.getlName());
    }

    void checkIfEntryStarted(){
        System.out.println("Empty Status : "+students.isEmpty());
    }
    void checkSize(){
        System.out.println("Number of students enrolled : "+students.size());
    }
    void printStack(){
        System.out.println(students);
    }
}
