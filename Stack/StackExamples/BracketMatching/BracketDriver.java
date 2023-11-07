package Stack.StackExamples.BracketMatching;

import java.util.Scanner;

public class BracketDriver {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        String input;
        while(true) { // intentional infinite loop
            System.out.print("Enter a string containing delimiters: ");
            input = keyboard.nextLine();
            if(input.equals("")){
                break;
            }
            BracketMatcher theMatcher = new BracketMatcher(input);
            theMatcher.match();
        } 
        keyboard.close();
    } // main()
} // class
