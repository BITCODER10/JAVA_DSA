package com.logicalnil;

import java.util.LinkedList;
import java.util.Queue;

public class QueueObject<E> {
    private final Queue<E> queue = new LinkedList<>();
    QueueObject(){

    }

    public void addObjects(E s){
        queue.offer(s);
    }

    public void removeObject(){
        queue.poll();
    }

    public E  peekFirstObject(){
        return queue.peek();
    }

    public void printValues(){
        System.out.println(queue);
    }



}
