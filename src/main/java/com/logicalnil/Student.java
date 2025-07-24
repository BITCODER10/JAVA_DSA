package com.logicalnil;

public class Student {


    private String fName;
    private String lName;
    private double gpa;
    private boolean result;

    Student(){
        this(null, null, 0, false);
    }
    Student(String fName){
        this(fName, null, 0, false);
    }

    Student(String fname, String lName, double gpa, boolean result){
        this.fName =fname;
        this.lName = lName;
        this.gpa =gpa;
        this.result = result;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }
}
