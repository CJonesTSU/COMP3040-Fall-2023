package Hashing.SepChain;

public class LinkedList {
    public Node head;
    public int size;

    public LinkedList() {
        head = null;
        size = 0;
    } // constructor

    public void append(int d){ // makes a new node as the head
        Node temp = new Node(d, head);
        head = temp;
        size++;
    } // Append method

    public Node remove() {
        Node temp = head;
        if(head != null)
            head = head.link;
        size--;
        return temp;
    } // Remove method

    public Node search(int key) {
        Node current = head;

        while(current != null && current.data != key) {
            current = current.link;
        }
        return current;
    } // Seatch 

    /* 
     * It seems odd to have a search method and also a searchPrevious
     * method. But search() return a copy of a node containing some data, searchPrevious()
     * returns the node which will end up being the node BEFORE an inserted node.
     * So, similar, but not identical purposes
     */
    public Node searchPrevious(int key) {
        Node current = head;

        while(current != null && current.link.data != key) {
            current = current.link;
        }
        return current;
    } // SearchPrevious method

    public void insert(int d, int previousKey) {
        Node current = search(previousKey);
        if(current != null) { // did we find the search key?
            Node temp = new Node(d, current.link);
            current.link = temp;
            size++;
        } else {
            System.out.println("Insertion failed");
        }
    } // Insert method 

    public void delete(int key) {
        if(head == null) { // is the list empty?
            System.out.println("List is empty");
            return; // bail out, we can't delete anything from an empty list
        }
        if(head.data == key) { // is the item to be removed the first in the list?
            head = head.link;
            size--;
        } else {
            Node temp = searchPrevious(key);
            if(temp != null) { // did we find the key?
                temp.link = temp.link.link;
            } else { // didn't find key, can't delete
                System.out.println("Delete failed, unable to locate key");
            }
        }
    } // delete method

    @Override
    public String toString(){
        Node temp = head;
        int count = 1;
        String result = String.format("Linked list: size: %d%n", size);
        result += String.format("Node %d: %d ", count, temp.data);
        count++;
        while(temp.link != null){
            temp = temp.link;
            result = result +  String.format(" -- > Node %d: %d", count, temp.data);
        }
        return result;
    } // toString
    
}
