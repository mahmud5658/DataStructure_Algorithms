package SinglyLinkedList;

// insert node at the end of a singly linked list
public class LinkedList3 {
    private static ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // insert last
    public static void insertLast(int value) {
        ListNode node = new ListNode(value);
        if (head == null) {
            head = node;
            return;
        }
        ListNode current = head;
        while (null != current.next) {
            current = current.next;
        }
        current.next = node;
    }
    // print singly linked list

    public static void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList3 s1 = new LinkedList3();

        insertLast(10);
        insertLast(20);
        insertLast(30);
        insertLast(40);
        insertLast(50);
        display();

    }
}
