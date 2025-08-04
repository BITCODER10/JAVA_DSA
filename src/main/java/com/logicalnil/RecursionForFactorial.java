package com.logicalnil;

public class RecursionForFactorial {
    private int upperLimit;
    RecursionForFactorial(){}

    public int getUpperLimit() {
        return upperLimit;
    }

    public void setUpperLimit(int upperLimit) {
        this.upperLimit = upperLimit;
    }
    public int runLogic(){
        return runFactorial(upperLimit);
    }

    private int runFactorial(int value){
        if(value <=1){
            return 1;
        }else return runFactorial(value -1)*value;
    }

}
