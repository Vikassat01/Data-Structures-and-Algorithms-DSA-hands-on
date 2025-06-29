package LinkedListNode;

import Stack.Stack;

public class StackLinkedListMain {
    StackLinkedList stackLinkedList = new StackLinkedList();
        public static void main(String[] args) {


                System.out.println("Main Menu Stack !!");

                Stack stack = new Stack(4);
                stack.push(30);
                stack.push(45);
                stack.push(90);
                //stack.pop();
//                stack.peek();
//                System.out.println(stack.peek());


                stack.displayElement();
            }
        }


