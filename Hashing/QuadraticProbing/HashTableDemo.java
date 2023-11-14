package Hashing.QuadraticProbing;

import java.io.IOException;
import java.util.Scanner;

public class HashTableDemo {

    public static void main(String[] args) throws IOException {
        DataItem aDataItem;
        int aKey, size, n, keysPerCell;
        Scanner keyboard = new Scanner(System.in);

        // get sizes
        System.out.print("Enter size of hash table: ");
        size = keyboard.nextInt();
        System.out.print("Enter initial number of items: ");
        n = keyboard.nextInt();
        keyboard.nextLine(); // clear out the left over carriage return
        keysPerCell = 10;
        // make table
        HashTable theHashTable = new HashTable(size);
        for (int j = 0; j < n; j++) // insert data
        {
            aKey = (int) (java.lang.Math.random() * keysPerCell * size);
            aDataItem = new DataItem(aKey);
            theHashTable.insert(aDataItem);
        }
        while (true) // interact with user
        {
            System.out.print("Enter first letter of ");
            System.out.print("show, insert, delete, or find: ");
            char choice = keyboard.nextLine().charAt(0);
            switch (choice) {
                case 's':
                    theHashTable.displayTable();
                    break;
                case 'i':
                    System.out.print("Enter key value to insert: ");
                    aKey = keyboard.nextInt();
                    keyboard.nextLine(); // clear out the left over carriage return
                    aDataItem = new DataItem(aKey);
                    theHashTable.insert(aDataItem);
                    break;
                case 'd':
                    System.out.print("Enter key value to delete: ");
                    aKey = keyboard.nextInt();
                    keyboard.nextLine(); // clear out the left over carriage return
                    theHashTable.delete(aKey);
                    break;
                case 'f':
                    System.out.print("Enter key value to find: ");
                    aKey = keyboard.nextInt();
                    keyboard.nextLine(); // clear out the left over carriage return

                    aDataItem = theHashTable.find(aKey);
                    if (aDataItem != null) {
                        System.out.println("Found " + aKey);
                    } else
                        System.out.println("Could not find " + aKey);
                    break;
                default:
                    System.out.print("Invalid entry\n");
            } // end switch
        } // end while
    } // end main()

} // end class HashTableDemo
