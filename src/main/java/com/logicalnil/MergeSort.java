package com.logicalnil;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    private int[] array;
    MergeSort(){}
    MergeSort(int[] array){
        this.array = array;
    }

    public void runDivide(){
        Divide(array, 0, (array.length-1));
    }

    private void Divide(int[] array, int l, int r){
        int m;
        if(l<r){
            m= l + (r-l)/2;
            Divide(array, l, m);
            Divide(array, m+1, r);
            conquer(l,m,r);

        }
    }

    private void conquer(int l, int m, int r){
        int size1 = m-l+1;
        int size2 = r-m;
        int[] L = new int[size1];
        int[] R = new int[size2];

        for (int i = 0; i < size1; i++) {
            L[i] = array[l+i];
        }
        for (int i = 0; i <size2; i++) {
            R[i] = array[m+1+i];
        }
        compareArrays(l, size1,size2, L, R);
    }

    private void compareArrays(int l, int n1, int n2, int[] L, int[] R){
        int i =0, j =0;
        int k = l;

        while (i< n1 && j <n2){
            if(L[i]<=R[j]){
                array[k] = L[i];
                i++;
            }else {
                array[k]=R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }


        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;
        }
    }

    @Override
    public String toString(){
        return Arrays.toString(array);
    }

    public void printCurrentState(int[]array , int l , int m){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = l; i <= m; i++) {
            arrayList.add(array[i]);
        }
        System.out.printf("\n\nLeft Side : %s from %d to %d ",arrayList,(l+1),(m+1));
    }

}

//100, 20, 10, 40, 30, 60, 50, 90
