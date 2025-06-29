package Queue;

public class CircularMain {
    public static void main(String[] args) {
    CircularQueue circularQueue = new CircularQueue(5);
    circularQueue.enqueue(10);
    circularQueue.enqueue(30);
    circularQueue.enqueue(15);
    circularQueue.enqueue(6);
    circularQueue.enqueue(100);
    circularQueue.display();
    circularQueue.enqueue(90);
    circularQueue.display();
       System.out.println("dequeue : " + circularQueue.dequeue());
        circularQueue.display();
        circularQueue.enqueue(5);
       circularQueue.display();

        System.out.println("Size of the queue: " + circularQueue.size());

}
}
