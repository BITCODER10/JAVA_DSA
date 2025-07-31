package com.logicalnil;

import java.util.Arrays;

public class BubbleSortClass {
    private int low;
    private int high;
    private int[] array;
    BubbleSortClass(){}
    BubbleSortClass( int[] array){
        this.low = 0;
        this.high = array.length-1;
        this.array = array;
    }

    public int[] sortArraylogic(){
        for (int i : array){
            runLoop();
            printArray();
        }

        return array;
    }
    public void runLoop(){
        for (int i = 0; i < high ; i++) {
            if(array[i]>array[i+1]){
                int temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
            }
        }
        high --;
    }
    private void printArray(){
        System.out.println(Arrays.toString(array));
    }
}
