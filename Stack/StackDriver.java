package Stack;

public class StackDriver {
    public static void main(String[] args)
    {
        Stack theStack = new Stack(10); // make new stack
        theStack.push(20);
        // push items onto stack
        theStack.push(40);
        theStack.push(60);
        theStack.push(80);

        System.out.println("Check to see if stack is empty: " + theStack.isEmpty());
        System.out.println("Check to see if stack is full: " + theStack.isFull());
        // now pop them back off and print
        while( !theStack.isEmpty() )
        {
            double value = theStack.pop();
            System.out.print(value);
            System.out.print(" ");
        } // end while
        System.out.println();
        System.out.println("Check to see if stack is empty: " + theStack.isEmpty());
        System.out.println("Check to see if stack is full: " + theStack.isFull());
    } // end main()
} // end class
