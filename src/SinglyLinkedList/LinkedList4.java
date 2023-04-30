package SinglyLinkedList;

public class LinkedList4 {
    private static ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // insert list node
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

    // insert at given position
    public static void insetAtPosition(int value, int position) {
        ListNode node = new ListNode(value);
        if (position == 1) {
            node.next = head;
            head = node;
        } else {
            ListNode previous = head;
            int count = 1;
            while (count < position - 1) {
                previous = previous.next;
                count++;
            }
            node.next = previous.next;
            previous.next = node;
        }
    }

    //display list node
    public static void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList4 s1 = new LinkedList4();

        insert(10);
        insert(20);
        insert(30);
        insert(40);
        insert(50);
        insert(60);
        display();
        insetAtPosition(90, 3);
        display();

    }
}
