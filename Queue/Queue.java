package Queue;

public class Queue {
    private int maxSize;
    private double[] queueArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int size){
        maxSize = size;
        queueArray = new double[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void enqueue(double num){
        if(rear == maxSize - 1){
            rear = -1;
        }
        rear++;
        queueArray[rear] = num;
        nItems++;
    }

    public double dequeue()
    {
        double temp = queueArray[front];
        front++;
        if(front == maxSize){
            front = 0;
        }
        nItems--;
        return temp;
    }

    public double peek(){
        return queueArray[front];
    }

    public boolean isEmpty() { // returns true if queue contains no items
        boolean empty = (nItems == 0);
        return empty;
    }

    public boolean isFull() { // returns true if the queue is full
        return (nItems == maxSize);
    }

    public int getSize(){
        return nItems;
    }
}
