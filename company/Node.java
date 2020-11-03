
package com.company;

public class Node<T extends Comparable<T>> {
    private T value;
    private Node<T> next;
    private Node<T> prev;
    private int priority;
    private int llegada;
    private int cpu;
    // PRIORITY 0-3

    public Node(T value, int priority, int llegada, int cpu) {

        this.value = value;
        this.llegada = llegada;
        this.priority = priority;
        this.cpu = cpu;

    }

    public Node(){
        
    }


    public T getValue() {

        return value;
    }

    public void setNext(Node next) {

        this.next = next;
    }

    public Node getNext() {

        return this.next;
    }

    public void setPrev(Node prev) {

        this.prev = prev;
    }

    public Node getPrev() {

        return this.prev;
    }

    public int getPriority() {
        return this.priority;
    }
    public int getLlegada() {
        return this.llegada;
    }
    public int getCPU() {
        return this.cpu;
    }

}
