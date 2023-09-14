package OrderedList;

public class OrderedListDriver {
    public static void main(String[] args){
        int maxSize = 100;
        OrderedList ol;

        ol = new OrderedList(maxSize);
        ol.insert(00);
        ol.insert(99);
        ol.insert(11);
        ol.insert(33);
        ol.insert(55);
        ol.insert(88);
        ol.insert(66);
        ol.insert(22);
        ol.insert(77);
        ol.insert(44);

        System.out.println("finished inserting values");
       System.out.println("List is now: " + ol);

        // // try a sucessful search
        // int searchKey = 55;
        // if(ol.find(searchKey) != -1) {
        //     System.out.printf("Searched for %d and found it.%n", searchKey);
        // } else {
        //     System.out.printf("Searched for %d but did not find it.%n", searchKey);
        // }

        // // now a failing search
        // searchKey = 18;
        // if(ol.find(searchKey) != -1) {
        //     System.out.printf("Searched for %d and found it.%n", searchKey);
        // } else {
        //     System.out.printf("Searched for %d but did not find it.%n", searchKey);
        // }       

        // print out the list
        // System.out.println("List is currently: " + ol);
        // ol.delete(00);
        // ol.delete(55);
        // ol.delete(77);
        // System.out.println("Deleted 00, 55, 77");
        // System.out.println("List is currently: " + ol);
    }
}
