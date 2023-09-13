package LinkedList;

public class LinkedList {
    public Node head;
    public int size;

    public LinkedList() {
        head = null;
        size = 0;
    }

    public void Append(int d){
        Node temp = new Node(d, null);
        temp.link = head;
        head = temp;
        size++;
    }

    public Node Remove() {
        Node temp = head;
        if(head != null)
            head = head.link;
        size--;
        return temp;
    }
    
}
