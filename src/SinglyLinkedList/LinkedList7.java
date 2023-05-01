package SinglyLinkedList;

public class LinkedList7 {
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

    //  print list node

    public static void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("null");
    }

    // delete at position
    public static void deleteAtPosition(int position) {
        if (position == 1) {
            head = head.next;
        } else {
            ListNode previous = head;
            int count = 1;
            while (count < position - 1) {
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = current.next;
        }
    }

    public static void main(String[] args) {
        LinkedList7 s1 = new LinkedList7();

        insert(10);
        insert(20);
        insert(30);
        insert(40);
        insert(50);

        display();

        deleteAtPosition(3);
        display();

    }
}
