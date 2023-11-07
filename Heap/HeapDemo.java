package Heap;

import java.io.IOException;
import java.util.Scanner;

public class HeapDemo {

    public static void main(String[] args) throws IOException
    {
        int value, value2;
        Heap theHeap = new Heap(31); // make a Heap; max size 31
        Scanner keyboard = new Scanner(System.in);
        boolean success;
        theHeap.insert(70); // insert 10 items
        theHeap.insert(40);
        theHeap.insert(50);
        theHeap.insert(20);
        theHeap.insert(60);
        theHeap.insert(100);
        theHeap.insert(80);
        theHeap.insert(30);
        theHeap.insert(10);
        theHeap.insert(90);
        while(true) // until [Ctrl]-[C]
        {
            System.out.print("Enter first letter of ");

            System.out.print("(s)how, (i)nsert, (r)emove, (c)hange: ");
            char choice = keyboard.nextLine().charAt(0);
            switch(choice)
            {
                case 's': // show
                    theHeap.displayHeap();
                    break;
                case 'i': // insert
                    System.out.print("Enter value to insert: ");
                    value = keyboard.nextInt();
                    keyboard.nextLine(); // just clearing out the queue
                    success = theHeap.insert(value);
                    if( !success )
                        System.out.println("Can't insert; heap full");
                    break;
                case 'r': // remove
                    if( !theHeap.isEmpty() )
                        theHeap.remove();
                    else
                        System.out.println("Can't remove; heap empty");
                    break;
                case 'c': // change
                    System.out.print("Enter current index of item: ");
                    value = keyboard.nextInt();
                    System.out.print("Enter new key: ");
                    value2 = keyboard.nextInt();
                    keyboard.nextLine(); // just clearing out the queue
                    success = theHeap.change(value, value2);
                    if( !success )
                        System.out.println("Invalid index");
                    break;
                default:
                    System.out.println("Invalid entry\n");
                } // end switch
            } // end while
    } // end main()
} // end class HeapApp  
