package PriorityQueue.HeapBasedPQ;

import java.io.IOException;

public class PriorityQueueDemo {
    public static void main(String[] args) throws IOException
    {
        PriorityQueue thePQ = new PriorityQueue(5);
        thePQ.insert(30);
        thePQ.insert(50);
        thePQ.insert(10);
        thePQ.insert(40);
        thePQ.insert(20);
        int temp = thePQ.remove();
        System.out.println("Removed " + temp);
        thePQ.insert(99);
        thePQ.insert(1);
        while(!thePQ.isEmpty())
        {
            int item = thePQ.remove();
            System.out.print(item + " "); // 50, 40, 30, 20, 10
        } // end while
        System.out.println();
    } // end main()
    //-------------------------------------------------------------
} // end class PriorityQueueDemo
