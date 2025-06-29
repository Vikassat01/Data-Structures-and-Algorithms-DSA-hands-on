package Queue;

public class CircularQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public CircularQueue(int capacity){
        queue=new int[capacity];
        front=0;
        rear=  -1;
        size=0;
        this.capacity=capacity;
    }

    //insert the data/element
    public void enqueue(int data) {
        if (size == capacity) {
            System.out.println("Queue is full  !!");
            return;
        }
        //this formula send the last index on the first 0 index
        //capacity=10  ====>>> rear(9+1)%10 =rear
        rear = (rear + 1) % capacity;
        queue[rear] = data;
        size++;
    }

    //Delate the element
    public int dequeue(){
        if (size==0){
            System.out.println("Queue is empty !!");
            return -1;
        }
        //actual delete
        int data=queue[front];
        front = (front+1)%capacity;
       size--;
       return data;
    }
    // return no of elements
    public int size(){
        return  this.size;
    }
    // Display the elements
    public void display() {
        if (this.size == 0) {
            System.out.println("Queue is empty !!");
            return;
        }
        for (int i = 0; i < size; i++) {
            int data = queue[(front + i)%capacity];
            System.out.print(data+ "\t");
        }
        System.out.println(); // Move to next line after printing all elements
    }


}









