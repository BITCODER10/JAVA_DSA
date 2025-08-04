package com.logicalnil;

import java.util.Arrays;

public class InsertionSort {
    private int[] array;
    InsertionSort(){}
    InsertionSort(int[] array){
        this.array =array;
    }
    
    public void runLogic(){
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i-1;

            while (j>=0 && array[j]>temp){
                array[j+1] = array[j];
                j--;
            }

            array[j+1] = temp;
            System.out.printf("\nIteration Number %d result is %s",i,this.toString());
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
