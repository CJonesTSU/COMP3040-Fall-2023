package Stack.StackExamples.ReverseAString;

public class Reverser {
    private String input;
    private String output;

    public Reverser(String input) {
        this.input = input;
    } // Reverser()

    public String reverse() {
        int stackSize = input.length();
        Stack theStack = new Stack(stackSize);


        // push the characters in the string into the stack
        char ch;
        for(int i = 0; i < input.length(); i++) {
            ch = input.charAt(i);
            theStack.push(ch);
        }
        output = ""; 
        while (!theStack.isEmpty()){
            ch = theStack.pop();  // get the character from the stack
            output = output + ch;  // append to output string
        }
        return output;
    }


} // class
