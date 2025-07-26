package com.logicalnil;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueObject<E> {
    private final Queue<E> pQueue = new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueueObject(){

    }

    void addEntry(E e){
        pQueue.offer(e);
    }
    void popObject(){
        while (!pQueue.isEmpty()){
            System.out.println("Popping out : "+pQueue.poll());
        }
    }

    public Queue<E> getpQueue() {
        return pQueue;
    }


}
