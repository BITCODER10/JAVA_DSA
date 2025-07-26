package com.logicalnil;

import java.util.LinkedList;

public class LinkedListClass<E> {
    private final LinkedList<E> linkedList = new LinkedList<>();
    LinkedListClass(){}
    void addFirst(E e){
        linkedList.addFirst(e);
    }
    void addLast(E e){
        linkedList.addLast(e);
    }
    void peepFirst(){
        System.out.println(linkedList.peek());
    }
    void insert(E e){
        linkedList.add(e);
    }
    void removeFrom(){
        linkedList.pollLast();
    }
    void printAll(){
        System.out.println(linkedList);
    }
    void insertAt(int i, E e){
        linkedList.add(i, e);
    }
    void remove(E e ){
        linkedList.remove(e);
    }

}
