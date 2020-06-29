package com.example.demo;

/**
 * @author renjing
 * @Description:
 * @date 2020/6/5下午6:38
 */
public class TestNode {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        node1.setNext(node2);
        node2.setNext(node3);

        Node node11 = new Node(2);
        Node node22 = new Node(3);
        Node node33 = new Node(4);
        node11.setNext(node22);
        node22.setNext(node33);

        System.out.println(node1);
        System.out.println(node11);


        Node start = new Node();
        Node end = new Node();
        start.setValue(node1.getValue() + node11.getValue());
        end = start;
        while (node1.getNext() != null && node11.getNext() != null) {
            node1 = node1.getNext();
            node11 = node11.getNext();
            Node temp = new Node(node1.getValue() + node11.getValue());
            end.setNext(temp);
            end = temp;
        }
        System.out.println(start);
    }
}

class Node {
    private int value;
    private Node next;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node(int value) {
        this.value = value;
    }

    public Node() {
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }
}