package LinkedListNode;


public class StackLinkedList {

    private Node top;

    public StackLinkedList(){
        this.top =null;
    }


    //Push

    public void push(int data){
        Node node = new Node(data);
        node.next=top;
        top=node;
    }

    //Pop
    public int pop(){
        if (isEmpty()){
            System.out.println("Stack is Empty !!");
            return -1;
        }else {
            int value= top.data;
            top=top.next;
            return value;
        }
    }

    //Peek
    public int peek(){
        if (isEmpty()){
            System.out.println("Stack is Empty !!");
            return -1;
        }else {
            return top.data;
        }
    }


    //isEmpty
    public boolean isEmpty(){
        if (this.top==null){
            System.out.println("Stack is Empty !!");
            return true;
        }else {
            return false;
        }
    }


    //display
    public void display(){
        if (isEmpty()){
            System.out.println("Stack is Empty !!");
            return;
        }else {
            Node temp=top;
            while(temp!=null){
                System.out.println(temp.data+ "\t");
                temp=temp.next;
            }
            System.out.println();
        }
    }
}
