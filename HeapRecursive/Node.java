package HeapRecursive;

public class Node {
    private int data; // data item (key)
    // -------------------------------------------------------------
    public Node(int key) // constructor
    {
        data = key;
    }
    // -------------------------------------------------------------


    public int getKey()
    {
        return data;
    }
    // -------------------------------------------------------------

    
    public void setKey(int id)
    {
        data = id;
    }
    // -------------------------------------------------------------
} // end class Node