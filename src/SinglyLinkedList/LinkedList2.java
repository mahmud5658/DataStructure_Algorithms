package SinglyLinkedList;

// insert node at the beginning of a singly linked list

public class LinkedList2 {
    private static ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // print singly linked list

    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("null");
    }

    // insert node at beginning
    public static void insertFirst(int value) {
        ListNode node = new ListNode(value);
        node.next = head;
        head = node;
    }

    // find length of the singly linked list
    public static int length() {
        if (head == null) {
            return 0;
        }
        int count = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public static void main(String[] args) {
        LinkedList2 s1 = new LinkedList2();

        insertFirst(10);
        insertFirst(20);
        insertFirst(30);
        insertFirst(40);
        insertFirst(50);

        s1.display();

        System.out.println("length is: " + length());
    }
}
