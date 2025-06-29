package singly;



public class LinkedList {

    Node head = null;

    // Insert at beginning
    public void insertAtBeginning(int item) {
        Node newNode = new Node(item);
        newNode.next = head;
        head = newNode;
    }

    // Insert at end
    public void insertAtEnd(int item) {
        Node newNode = new Node(item);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Insert at specific position
    public void insertAtPosition(int item, int position) {
        if (position < 0) {
            System.out.println("Invalid position");
            return;
        }

        Node newNode = new Node(item);

        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;
        int index = 0;

        while (temp != null && index < position - 1) {
            temp = temp.next;
            index++;
        }

        if (temp == null) {
            System.out.println("Position out of bounds");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // ✅ Delete node by value
    public void deleteByValue(int value) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        // If head node itself holds the value
        if (head.data == value) {
            head = head.next;
            System.out.println("Deleted node with value: " + value);
            return;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != value) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Value not found in the list");
        } else {
            temp.next = temp.next.next;
            System.out.println("Deleted node with value: " + value);
        }
    }

    // ✅ Search for a value
    public boolean search(int value) {
        Node temp = head;
        int position = 0;

        while (temp != null) {
            if (temp.data == value) {
                System.out.println("Value " + value + " found at position: " + position);
                return false;
            }
            temp = temp.next;
            position++;
        }

        System.out.println("Value " + value + " not found in the list");
        return false;
    }

    // Print list
    public void printData() {
        if (head == null) {
            System.out.println("LinkedList is empty!");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "=>");
            temp = temp.next;
        }
        System.out.println();
    }


    public void deleteFirst() {
    }

    public void deleteLast() {
    }

    public void deleteFromPosition(int position) {
    }
}
