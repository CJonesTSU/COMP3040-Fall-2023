package LinkedList;

public class DriverProgram {
    public static void main(String[] args){
        Node node1 = new Node();
        System.out.println("New empty node: " + node1);
        Node node2 = new Node(100, node1);
        System.out.println("New node, data = 100: " + node2);
        LinkedList list = new LinkedList();
        list.append(305);
        System.out.println(list);
        list.append(550);
        System.out.println(list);
        list.append(12);
        list.append(23);
        list.append(44);
        list.append(137);
        list.append(111);
        System.out.println(list);
        list.remove(); // removes the head node (data 111)
        System.out.println(list);
        list.delete(12); // removes the node with data '12'
        System.out.println(list);
        list.insert(99,23);
        System.out.println(list);

        //list.Remove();
        //System.out.println("List size is: " + list.size);
        System.out.println("Code ran");
    }

}
