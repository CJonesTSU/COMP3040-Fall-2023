package LinkedList;

public class Node {
    public int data;
    public Node link = null;

    public Node(){
        data = 0;
        link = null;
    } // no-args constructor

    public Node(int data, Node n) {
        this.data = data;
        link = n;
    } // constructor

    @Override
    public String toString() {
        String result = String.format("Node: data = %d", data );
        return result;
    } // toString
}
