package Queue;

public class QueueDriver {
    public static void main(String[] args){
        Queue theQueue = new Queue(5);

        theQueue.enqueue(10);
        theQueue.enqueue(20);
        theQueue.enqueue(30);
        theQueue.enqueue(40);

        System.out.println(theQueue.dequeue());
        System.out.println(theQueue.dequeue());
        System.out.println(theQueue.dequeue());

        theQueue.enqueue(50);
        theQueue.enqueue(60);
        theQueue.enqueue(70);
        theQueue.enqueue(80);

        while(!theQueue.isEmpty()){
            System.out.print(theQueue.dequeue() + " ");
        }
        System.out.println();


    }
    
}
