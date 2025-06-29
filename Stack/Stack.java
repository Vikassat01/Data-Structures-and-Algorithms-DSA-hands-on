package Stack;

public class Stack {

    private int[] array;
    private int maxSize;
    private int top= -1;

    public Stack(int size){
        this.maxSize=size;
        array=new int[maxSize];
        top = -1;
    }

    //push operation
    public void push(int data){
        if (top==maxSize){
            System.out.println("Stack is full !!");
            return;
        }else {
            top++;
            array[top] = data;
        }
    }
    //method for check empyt
    public boolean isEmpty(){
        return top== -1;
    }
    //pop operation
    public int pop(){
        if (isEmpty()){
            System.out.println("Stsck is Empty !!");
            return -1;
        }else {
            int popElement = array[top];
            top--;
            return popElement;
        }
    }

    //peek operation
    public int peek(){
        if (isEmpty()){
            System.out.println("Stack is Empty !!");
            return -1;
        }else {
            return array[top];
        }

    }

    //Display
    public void displayElement(){
        if (isEmpty()){
            System.out.println("Stack is Empty !!");
            return;
        }
        for (int i=0; i<=top; i++){
            System.out.println(array[i]+"\t");
        }
        System.out.println();
    }

}
