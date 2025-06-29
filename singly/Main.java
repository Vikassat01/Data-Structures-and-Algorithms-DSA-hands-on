package singly;

import java.util.Scanner;

public class Main {

    public static void printMenu() {
        System.out.println("---------MENU---------------");
        System.out.println("ENTER 1 TO INSERT");
        System.out.println("ENTER 2 TO DELETE");
        System.out.println("ENTER 3 TO SEARCH");
        System.out.println("ENTER 4 TO DISPLAY");
        System.out.println("ENTER 5 TO EXIT");
        System.out.println("Enter your choice:");
        System.out.println("**********************************");
    }

    public static void printInsertMenu() {
        System.out.println("Press 1 to insert at Head");
        System.out.println("Press 2 to insert at Tail");
        System.out.println("Press 3 to insert at specific position");
    }

    public static void printDeleteMenu() {
        System.out.println("Press 1 to delete from Head");
        System.out.println("Press 2 to delete from Tail");
        System.out.println("Press 3 to delete from specific position");
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        Scanner scanner = new Scanner(System.in);

        System.out.println("************* Welcome To LinkedList App *************");

        while (true) {
            try {
                printMenu();
                int choice = scanner.nextInt();

                if (choice == 1) {
                    insertLinkedList(linkedList, scanner);
                } else if (choice == 2) {
                    deleteFromLinkedList(linkedList, scanner);
                } else if (choice == 3) {
                    System.out.println("Enter the data you want to search:");
                    int data = scanner.nextInt();
                    boolean result = linkedList.search(data);
                    if (result) {
                        System.out.println("Yes, data is present in the list.");
                    } else {
                        System.out.println("No, data is not present in the list.");
                    }
                } else if (choice == 4) {
                    linkedList.printData();
                } else if (choice == 5) {
                    System.out.println("Thank you for using the app.");
                    break;
                } else {
                    System.out.println("Invalid choice!!");
                }
            } catch (Exception ex) {
                System.out.println("Error: " + ex.getMessage());
                scanner.nextLine(); // clear invalid input
            }
        }

        scanner.close();
    }

    private static void insertLinkedList(LinkedList linkedList, Scanner scanner) {
        printInsertMenu();
        System.out.println("Enter your choice:");
        int insertChoice = scanner.nextInt();

        if (insertChoice == 1) {
            System.out.println("Enter your data:");
            int data = scanner.nextInt();
            linkedList.insertAtBeginning(data);
            System.out.println("Success!");
        } else if (insertChoice == 2) {
            System.out.println("Enter your data:");
            int data = scanner.nextInt();
            linkedList.insertAtEnd(data);
            System.out.println("Success!");
        } else if (insertChoice == 3) {
            System.out.println("Enter position:");
            int position = scanner.nextInt();
            System.out.println("Enter data:");
            int data = scanner.nextInt();
            linkedList.insertAtPosition(data, position);
            System.out.println("Success!");
        } else {
            System.out.println("Invalid choice!");
        }
    }

    private static void deleteFromLinkedList(LinkedList linkedList, Scanner scanner) {
        printDeleteMenu();
        System.out.println("Enter your choice:");
        int deleteChoice = scanner.nextInt();

        if (deleteChoice == 1) {
            linkedList.deleteFirst();
            System.out.println("Deleted!");
        } else if (deleteChoice == 2) {
            linkedList.deleteLast();
            System.out.println("Deleted!");
        } else if (deleteChoice == 3) {
            System.out.println("Enter position:");
            int position = scanner.nextInt();
            linkedList.deleteFromPosition(position);
            System.out.println("Deleted!");
        } else {
            System.out.println("Invalid choice!");
        }
    }
}
