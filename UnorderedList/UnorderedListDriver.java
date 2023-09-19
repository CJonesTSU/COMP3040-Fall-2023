package UnorderedList;

public class UnorderedListDriver {
    private static final int MAX_SIZE = 100;
    public static void main(String[] args){
        
        UnorderedList lst;
        lst = new UnorderedList(MAX_SIZE);
        lst.append(77);
        lst.append(99);
        lst.append(44);        
        lst.append(55);
        lst.append(22);
        lst.append(11);
        lst.append(88);
        lst.append(00);
        lst.append(66);
        lst.append(33);
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
