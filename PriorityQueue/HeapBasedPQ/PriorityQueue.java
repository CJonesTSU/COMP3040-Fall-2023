package PriorityQueue.HeapBasedPQ;

public class PriorityQueue {

    // array in sorted order, from max at 0 to min at size-1
    private Heap theHeap;
    //private long[] queArray;
    //private int nItems;
    //-------------------------------------------------------------
    public PriorityQueue(int s) // constructor
    {
        //Heap theHeap = new Heap(s);
        theHeap = new Heap(s);
        System.out.println("PQ constructor");
    }
    //-------------------------------------------------------------
    public void insert(int item) // insert item
    {
       theHeap.insert(item);
    } // end insert()
    //-------------------------------------------------------------
    public int remove() // remove minimum item
    {
        return theHeap.remove().getKey();
    }
    //-------------------------------------------------------------
    // public long peekMin() // peek at minimum item
    // {
    //     return queArray[nItems-1];
    // }
    //-------------------------------------------------------------
    public boolean isEmpty() // true if queue is empty
    {
        return theHeap.isEmpty();
    }
    //-------------------------------------------------------------
    //public boolean isFull() // true if queue is full
    // {
    //     return (nItems == maxSize);
    // }
    //-------------------------------------------------------------
    } // end class PriorityQ
    