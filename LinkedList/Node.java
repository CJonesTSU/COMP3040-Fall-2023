package LinkedList;

public class Node {
    public int data;
    public Node link = null;

    public Node(){
        data = 0;
        link = null;
    }

    public Node(int data, Node n) {
        this.data = data;
        link = n;
    }

    @Override
    public String toString() {
        String result = String.format("Node: data = %d", data );
        return result;
    }
}
