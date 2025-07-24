package com.logicalnil;

import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        QueueObject<Integer> queueObjectIntegers = new QueueObject<>();
        QueueObject<String> queueObject = new QueueObject<>();

        queueObjectIntegers.addObjects(1);
        queueObjectIntegers.addObjects(11);
        queueObjectIntegers.addObjects(111);
        queueObjectIntegers.addObjects(1111);
        queueObjectIntegers.addObjects(11111);
        queueObjectIntegers.addObjects(111111);
        queueObjectIntegers.printValues();

        queueObject.addObjects("one");
        queueObject.addObjects("one one ");
        queueObject.addObjects("one one one");
        queueObject.addObjects("one one one one");
        queueObject.addObjects("one one one one one");
        queueObject.addObjects(String.valueOf(6));
        queueObject.printValues();

//        queueObject.removeObject();
        System.out.println("\n\nFirst Object is :"+queueObject.peekFirstObject());

        HashMap<QueueObject<Integer> , QueueObject<String>> h = new HashMap<>();
        h.put(queueObjectIntegers, queueObject);

        for(Map.Entry<QueueObject<Integer> , QueueObject<String>> entry: h.entrySet()){
            System.out.println(entry.getKey().peekFirstObject() +" "+entry.getValue().peekFirstObject());
        }
    }
}