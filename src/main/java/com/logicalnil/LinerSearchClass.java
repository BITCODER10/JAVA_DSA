package com.logicalnil;

import java.util.ArrayList;

public class LinerSearchClass {


    private ArrayList<Integer> arrayList = new ArrayList<>();




    LinerSearchClass(){};
    LinerSearchClass(ArrayList<Integer> arrayList){
        this.arrayList = arrayList;
    }

    public void setArrayList(ArrayList<Integer> arrayList) {
        this.arrayList = arrayList;
    }

    public Integer linearSearch(Integer value){
        for (int i = 0; i <arrayList.size() ; i++) {
            if(arrayList.get(i).equals(value)){

                return i;
            }
        }
        return -1;
    }
    public ArrayList<Integer> printAll(){
        return arrayList;
    }


}
