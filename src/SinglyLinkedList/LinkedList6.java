package SinglyLinkedList;

// delete last node of a singly linked list
public class LinkedList6 {
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

    // delete last

    public static void deleteLast() {
        if (head == null || head.next == null) {
            return;
        }
        ListNode current = head;
        ListNode previous = null;
        while (current.next != null) {
            previous = current;
            current = current.next;
        }
        previous.next = null;
    }

    public static void main(String[] args) {
        LinkedList6 a1 = new LinkedList6();

        insert(10);
        insert(20);
        insert(30);
        insert(40);
        insert(50);

        display();
        deleteLast();
        display();
    }
}
