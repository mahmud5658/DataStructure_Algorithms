package SinglyLinkedList;

// delete fist node of a singly linked list

import java.util.Objects;

public class LinkedList5 {
    private static ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // insert node
    public static void insert(int value) {
        ListNode node = new ListNode(value);
        if (head == null) {
            head = node;
            return;
        }
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = node;
    }

    // print node
    public static void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("null");
    }

    // delete first node

    public static ListNode deleteFirst() {
        if (head == null) {
            return null;
        }
        ListNode temp = head;
        head = temp.next;
        temp.next = null;
        return temp;
    }

    public static void main(String[] args) {
        LinkedList5 s1 = new LinkedList5();

        insert(10);
        insert(20);
        insert(30);
        insert(40);
        insert(50);
        display();
        System.out.println(Objects.requireNonNull(deleteFirst()).data);

        display();
    }
}
