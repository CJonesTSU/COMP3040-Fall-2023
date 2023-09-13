package LinkedList;

public class DriverProgram {
    public static void main(String[] args){
        Node node1 = new Node();
        Node node2 = new Node(100, node1);
        LinkedList list = new LinkedList();
        list.Append(305);
        list.Append(550);
        System.out.println("List size is: " + list.size);
        list.Remove();
        System.out.println("List size is: " + list.size);
        System.out.println("Code ran");
    }
}
