package com.logicalnil;

public class InterpolationSeachClass {
    int[] array;
    int low;
    int high;
    int target;

    InterpolationSeachClass(){}

    InterpolationSeachClass(int[] array, int low, int high, int target){
        this.low = low;
        this.high = (high-1);
        this.array = array;
        this.target = target;
    }

    void runLogic(){
        System.out.println();
        System.out.println();
        System.out.println("low : "+low);
        System.out.println("high: "+high);
        System.out.println("target : "+target);
        System.out.println("array[low] : "+array[low]);
        System.out.println("array[high] : "+array[high]);

        if(low > high || target < array[low] || target > array[high]){
            System.out.println("Not Found");
            return;
        }
        int probe = calProbe();
        if (array[probe] == target){
            System.out.println("Congratulations, Value Found at index "+probe);
        }else if(array[probe] < target){
            low = probe +1;
            runLogic();
        }else if(array[probe] > target){
            high = probe -1;
            runLogic();
        }
    }

    int calProbe(){
        if(array[high] == array[low]){
            return low; // All elements same, return any index
        }
        int probe = low + (high - low)*(target - array[low])/(array[high] - array[low]);
        System.out.println("Probe : "+probe);
        return probe;
    }

}
