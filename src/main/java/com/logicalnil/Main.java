package com.logicalnil;

public class Main {
    public static void main(String[] args) {
        int[] array = {100, 20, 10, 40, 30, 60, 50, 90};
        MergeSort mergeSort = new MergeSort(array);
        mergeSort.runDivide();
        System.out.println(mergeSort.toString());
    }
}