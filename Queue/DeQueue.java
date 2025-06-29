package Queue;

public class DeQueue {

    private int [] arr;
    private int capacity;
    private int front;
    private int rear;
    private int size;

    //initialization of array and constructor
    public DeQueue(int capacity){
        this.capacity=capacity;
        arr=new int[this.capacity];
        front=-1;
        rear=-1;
        size=0;
    }
    public boolean isfull(){
        return size==capacity;
//        if (size==capacity){
//            return true;
//        }else {
//            return false;
//        }
    }
    //check queue is empty or not
    public boolean isEmpty(){
        return size==0;
    }
    //make function to insert data
    public void insertFront(int data){ //function
        //check queue is full/empty and operation for front for their position
        if (isfull()){
            System.out.println("Queue is full !!");
            return;
        }
        if (isEmpty()){
           front=0;
           rear=0;
        }
        else if (front==0) {//if queue is between or unknown position
            front=capacity-1; //if queue is between or zero position make it fron position
        }else {
            front--;
        }
        arr[front] = data;
        size++;
    }
    //insert operation for rear
    public void insertRear(int data){
        if (isfull()){
            System.out.println("Queue is full !!");
            return;
        }
        if (isEmpty()){
            front=-1;
            rear=-1;
        }
        else if (rear==capacity-1){
            rear = 0;
        }else {
            rear++;
        }
        arr[rear] = data;
        size++;
    }
}





