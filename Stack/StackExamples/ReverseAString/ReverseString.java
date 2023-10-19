package Stack.StackExamples.ReverseAString;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String input = "";
        String output = "";

        // priming read
        System.out.print("Enter the word to reverse (enter to end): ");
        input = keyboard.nextLine();
        while (!input.equals("")) {
            Reverser theR = new Reverser(input);
            output = theR.reverse();
            System.out.println(input + " reversed is " + output);
            System.out.print("Enter the word to reverse (enter to end): ");
            input = keyboard.nextLine();
        } // while
        keyboard.close();
    } // main()
} // class
