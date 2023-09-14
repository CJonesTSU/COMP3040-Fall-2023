package UnorderedList;

public class UnorderedListDriver {
    private static final int MAX_SIZE = 100;
    public static void main(String[] args){
        
        UnorderedList lst;
        lst = new UnorderedList(MAX_SIZE);
        lst.insert(77);
        lst.insert(99);
        lst.insert(44);        
        lst.insert(55);
        lst.insert(22);
        lst.insert(11);
        lst.insert(88);
        lst.insert(00);
        lst.insert(66);
        lst.insert(33);
        System.out.println(lst);

        // Let's try a successful search
        int searchKey = 33;
        if(lst.find(searchKey)){  // found it
            System.out.printf("Found search key %d in the list%n" , searchKey);
        } else { // not found
            System.out.printf("Can't find key %d in the list%n" , searchKey);
        }

        // Let's try a failed search
        searchKey = 35;
        if(lst.find(searchKey)){  // found it
            System.out.printf("Found search key %d in the list%n" , searchKey);
        } else { // not found
            System.out.printf("Can't find key %d in the list%n" , searchKey);
        }

        System.out.println("removing value 00");
        lst.delete(00);
        System.out.println("removing value 55");
        lst.delete(55);
        System.out.println("removing value 99");
        lst.delete(99);

        // print the now shorter list
        System.out.println(lst);
    } // main
}
