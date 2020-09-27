package com.company;

public class Node {
    private String name;
    private int number;
    private Node next;

    public Node(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

}
