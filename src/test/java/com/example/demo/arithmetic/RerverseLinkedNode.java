package com.example.demo.arithmetic;


import lombok.Data;


/**
 * @author renjing
 * @Description:
 * @date 2023/3/1714:21
 */
public class RerverseLinkedNode {

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(1);
        Node node4 = new Node(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

//        print(reverse(node1));
//        System.out.println(checkCycle(node1));
    }

    /**
     * 翻转单链表
     */
    public static Node reverse(Node head) {
        Node pre = null;
        Node next = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }

    /**
     * 快慢指针判断链表有环
    */
    public static boolean checkCycle(Node head) {
        if(head == null || head.next == null) {
            return false;
        }
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void print(Node node) {
        while(node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }

    @Data
    public static class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }
}